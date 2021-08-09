package com.alibaba.app;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.utils.MyKafkaUtil;
import org.apache.flink.runtime.state.filesystem.FsStateBackend;
import org.apache.flink.streaming.api.CheckpointingMode;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;

/**
 * @author fada.yu
 * @version 1.0
 * @date 2021/8/4 15:42
 * @Desc:
 * 从Kafka中读取ods层业务数据 并进行处理  发送到DWD层
 *1.业务数据保存到Kafka的主题中
 * 2.维度数据保存到Hbase的表中
 *
 */

public class BaseDBApp {
    public static void main(String[] args) throws Exception {
        //TODO 0.基本环境准备
        //Flink流式处理环境
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(4);

        //设置CK相关参数
        env.enableCheckpointing(5000, CheckpointingMode.EXACTLY_ONCE);
        env.getCheckpointConfig().setCheckpointTimeout(60000);
        env.setStateBackend(new FsStateBackend("hdfs://hadoop202:8020/gmall/flink/checkpoint"));
        System.setProperty("HADOOP_USER_NAME", "alibaba");

        //TODO 1.接收Kafka数据，过滤空值数据
        //定义消费者组以及指定消费主题
        String topic = "ods_base_db_m";
        String groupId = "ods_base_group";

        //从Kafka主题中读取数据
        FlinkKafkaConsumer<String> kafkaSource  = MyKafkaUtil.getKafkaSource(topic,groupId);
        DataStream<String> jsonDstream   = env.addSource(kafkaSource);
        //jsonDstream.print("data json:::::::");

        //对数据进行结构的转换   String->JSONObject
        DataStream<JSONObject>  jsonStream   = jsonDstream.map(jsonStr -> JSON.parseObject(jsonStr));
        //DataStream<JSONObject>  jsonStream   = jsonDstream.map(JSON::parseObject);

        //过滤为空或者 长度不足的数据
        SingleOutputStreamOperator<JSONObject> filteredDstream = jsonStream.filter(
                jsonObject -> {
                    boolean flag = jsonObject.getString("table") != null
                            && jsonObject.getJSONObject("data") != null
                            && jsonObject.getString("data").length() > 3;
                    return flag;
                }) ;
        filteredDstream.print("json::::::::");

        env.execute();
    }


}

