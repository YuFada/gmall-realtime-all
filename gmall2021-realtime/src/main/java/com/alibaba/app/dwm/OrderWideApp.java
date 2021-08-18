package com.alibaba.app.dwm;

import com.alibaba.bean.OrderInfo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.utils.MyKafkaUtil;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.common.functions.RichMapFunction;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.runtime.state.StateBackend;
import org.apache.flink.runtime.state.filesystem.FsStateBackend;
import org.apache.flink.streaming.api.CheckpointingMode;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.types.StringValue;
import scala.compat.java8.converterImpl.StepsIntLikeGapped;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;

/**
 * @author fada.yu
 * @version 1.0
 * @date 2021/8/17 16:24
 * @Desc:
 * 处理订单和订单明细数据形成订单宽表
 */
public class OrderWideApp {
    public static void main(String[] args) {
        //TODO 0.基本环境准备
        StreamExecutionEnvironment env  = StreamExecutionEnvironment.getExecutionEnvironment();
        //设置并行度读取kafka分区数据
        env.setParallelism(4);
        //设置CK相关配置
        env.enableCheckpointing(5000, CheckpointingMode.EXACTLY_ONCE);
        env.getCheckpointConfig().setCheckpointTimeout(60000);
        StateBackend fsStateBackend = new FsStateBackend("hdfs://hadoop:8020/gmall/flink/checkpoint/OrderWideApp");
        env.setStateBackend(fsStateBackend);
        System.setProperty("HADOOP_USER_NAME", "alibaba");

        //TODO 1.从Kafka的dwd层接收订单和订单明细数据
        String orderInfoSourceTopic = "dwd_order_info";
        String  orderDetailSourceTopic = "dwd_order_detail";
        String orderWideSinkTopic = "dwm_order_wide";
        String groupId = "order_wide_group";

        //从Kafka中读取数据
        FlinkKafkaConsumer<String> sourceOrderInfo  = MyKafkaUtil.getKafkaSource(orderInfoSourceTopic,groupId);
        FlinkKafkaConsumer<String> sourceOrderDetail  = MyKafkaUtil.getKafkaSource(orderDetailSourceTopic,groupId);
        DataStream<String> orderInfojsonDStream   = env.addSource(sourceOrderInfo);
        DataStream<String> orderDetailJsonDStream   = env.addSource(sourceOrderDetail);

        SingleOutputStreamOperator<OrderInfo> orderInfoDStream    = orderInfojsonDStream.map(new RichMapFunction<String, OrderInfo>() {
            SimpleDateFormat simpleDateFormat = null;

            @Override
            public void open(Configuration parameters) throws Exception {
                super.open(parameters);
                simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            }

            @Override
            public OrderInfo map(String jsonString) throws Exception {
                OrderInfo orderInfo = JSON.parseObject(jsonString, OrderInfo.class);
                orderInfo.setCreate_ts(simpleDateFormat.parse(orderInfo.getCreate_time()).getTime());


                return orderInfo;
            }
        });

    }
}
