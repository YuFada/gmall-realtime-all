package com.alibaba.app.dwm;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.utils.MyKafkaUtil;
import org.apache.flink.api.common.eventtime.SerializableTimestampAssigner;
import org.apache.flink.api.common.eventtime.WatermarkStrategy;
import org.apache.flink.cep.CEP;
import org.apache.flink.cep.PatternFlatSelectFunction;
import org.apache.flink.cep.PatternFlatTimeoutFunction;
import org.apache.flink.cep.PatternStream;
import org.apache.flink.cep.pattern.Pattern;
import org.apache.flink.cep.pattern.conditions.SimpleCondition;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.KeyedStream;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.windowing.time.Time;
import org.apache.flink.util.Collector;
import org.apache.flink.util.OutputTag;

import java.util.List;
import java.util.Map;

/**
 * @author fada.yu
 * @version 1.0
 * @date 2021/8/11 10:52
 * @Desc: 访客的跳出情况判断
 * 从dwd层 dwd_page_log中读取数据
 *
 * 思路：
 * 3.1.2计算跳出行为的思路
 * 首先要识别哪些是跳出行为，要把这些跳出的访客最后一个访问的页面识别出来。那么要抓住几个特征：
 * 该页面是用户近期访问的第一个页面
 * 这个可以通过该页面是否有上一个页面（last_page_id）来判断，如果这个表示为空，就说明这是这个访客这次访问的第一个页面。
 * 首次访问之后很长一段时间（自己设定），用户没继续再有其他页面的访问。
 * 这第一个特征的识别很简单，保留last_page_id为空的就可以了。但是第二个访问的判断，其实有点麻烦，首先这不是用一条数据就能得出结论的，需要组合判断，要用一条存在的数据和不存在的数据进行组合判断。而且要通过一个不存在的数据求得一条存在的数据。更麻烦的他并不是永远不存在，而是在一定时间范围内不存在。那么如何识别有一定失效的组合行为呢？
 * 最简单的办法就是Flink自带的CEP技术。这个CEP非常适合通过多条数据组合来识别某个事件。
 * 用户跳出事件，本质上就是一个条件事件加一个超时事件的组合。
 */
public class UserJumpDetailApp {
    public static void main(String[] args) throws Exception {
        //TODO 0.基本环境准备
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(4);

        //TODO 1.从kafka的dwd_page_log主题中读取页面日志
        String sourceTopic = "dwd_page_log";
        String groupId = "userJumpDetailApp";
        String sinkTopic = "dwm_user_jump_detail";

        //从kafka中读取数据
        DataStreamSource<String> dataStream = env.addSource(MyKafkaUtil.getKafkaSource(sourceTopic, groupId));

        //对数据进行结构化转换
        SingleOutputStreamOperator<JSONObject> jsonObjStream = dataStream.map(jsonString ->
                JSON.parseObject(jsonString));


//        注意：flink1.12默认的时间语义就是事件时间，所以不需要执行
        env.setStreamTimeCharacteristic(TimeCharacteristic.EventTime);


        //TODO 2.指定事件时间字段
        SingleOutputStreamOperator<JSONObject> jsonObjWithEtDstream = jsonObjStream.assignTimestampsAndWatermarks(WatermarkStrategy.<JSONObject>forMonotonousTimestamps().withTimestampAssigner(new SerializableTimestampAssigner<JSONObject>() {
            @Override
            public long extractTimestamp(JSONObject jsonObject, long l) {
                return jsonObject.getLong("ts");
            }
        }));
        //TODO 3.根据日志数据的mid进行分组
        KeyedStream<JSONObject, String> jsonObjectStringKeyedStream = jsonObjWithEtDstream.keyBy(jsonObj ->
                jsonObj.getJSONObject("common").getString("data"));

        //TODO 4.配置CEP表达式
        Pattern<JSONObject, JSONObject> pattern = Pattern.<JSONObject>begin("GoIn").where(
                new SimpleCondition<JSONObject>() {
                    // 条件1 ：进入的第一个页面
                    @Override
                    public boolean filter(JSONObject jsonObj) throws Exception {
                        String lastPageId = jsonObj.getJSONObject("page").getString("last_page_id");
                        System.out.println("first in :" + lastPageId);
                        if (lastPageId != null || lastPageId.length() == 0) {
                            return true;
                        }
                        return false;
                    }
                }
        ).next("next").where(
                new SimpleCondition<JSONObject>() {
                    //条件2： 在10秒时间范围内必须有第二个页面
                    @Override
                    public boolean filter(JSONObject jsonObj) throws Exception {
                        String pageId = jsonObj.getJSONObject("page").getString("page_id");
                        if (pageId != null || pageId.length() > 0) {
                            return true;
                        }

                        return false;
                    }
                }
        ).within(Time.seconds(10));
        //TODO 5.根据表达式筛选流
        PatternStream<JSONObject> patternedStream = CEP.pattern(jsonObjectStringKeyedStream, pattern);

        //TODO 6.提取命中的数据

        OutputTag<String> timeoutTag = new OutputTag<>("timeout");
        SingleOutputStreamOperator<String> filteredStream = patternedStream.flatSelect(timeoutTag, new PatternFlatTimeoutFunction<JSONObject, String>() {
                    @Override
                    public void timeout(Map<String, List<JSONObject>> pattern, long timeoutTimestamp, Collector<String> out) throws Exception {
                        List<JSONObject> objectList = pattern.get("GoIn");
                        //这里进入out的数据都被timeoutTag标记
                        for (JSONObject jsonObject : objectList) {
                            out.collect(jsonObject.toJSONString());
                        }
                    }
                },
                new PatternFlatSelectFunction<JSONObject, String>() {
                    @Override
                    public void flatSelect(Map<String, List<JSONObject>> pattern, Collector<String> out) throws Exception {
                        //因为不超时的事件不提取，所以这里不写代码
                    }
                }
        );
//通过SideOutput侧输出流输出超时数据
        DataStream<String> jumpDstream = filteredStream.getSideOutput(timeoutTag);
        jumpDstream.print("jump::");

        //TODO 7.将跳出数据写回到kafka的DWM层
        jumpDstream.addSink(MyKafkaUtil.getKafkaSink(sinkTopic));
        env.execute();

    }
}
