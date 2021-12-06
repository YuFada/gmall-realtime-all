package com.alibaba.app.dws;

import com.alibaba.bean.OrderWide;
import com.alibaba.bean.PaymentWide;
import com.alibaba.bean.ProductStats;
import com.alibaba.common.GmallConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.utils.DateTimeUtil;
import com.alibaba.utils.MyKafkaUtil;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.ProcessFunction;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.util.Collector;

import java.util.Collections;
import java.util.HashSet;

/**
 * @author fada.yu
 * @version 1.0
 * @date 2021/12/6 18:15
 * @Desc: 形成以商品为准的统计  曝光 点击  购物车  下单 支付  退单  评论数 宽表
 */
public class ProductStatsApp {
    public static void main(String[] args) throws Exception {
        // TODO: 2021/12/6  基本环境准备
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        //设置并行度
        env.setParallelism(4);
        /*
        //检查点CK相关设置
        env.enableCheckpointing(5000, CheckpointingMode.AT_LEAST_ONCE);
        env.getCheckpointConfig().setCheckpointTimeout(60000);
        StateBackend fsStateBackend = new FsStateBackend(
                "hdfs://hadoop202:8020/gmall/flink/checkpoint/ProductStatsApp");
        env.setStateBackend(fsStateBackend);
        System.setProperty("HADOOP_USER_NAME","atguigu");
        */

        //TODO 1.从Kafka中获取数据流
        String groupId = "product_stats_app";

        String pageViewSourceTopic = "dwd_page_log";
        String orderWideSourceTopic = "dwm_order_wide";
        String paymentWideSourceTopic = "dwm_payment_wide";
        String cartInfoSourceTopic = "dwd_cart_info";
        String favorInfoSourceTopic = "dwd_favor_info";
        String refundInfoSourceTopic = "dwd_order_refund_info";
        String commentInfoSourceTopic = "dwd_comment_info";

        FlinkKafkaConsumer<String> pageViewSource = MyKafkaUtil.getKafkaSource(pageViewSourceTopic, groupId);
        FlinkKafkaConsumer<String> orderWideSource = MyKafkaUtil.getKafkaSource(orderWideSourceTopic, groupId);
        FlinkKafkaConsumer<String> paymentWideSource = MyKafkaUtil.getKafkaSource(paymentWideSourceTopic, groupId);
        FlinkKafkaConsumer<String> favorInfoSourceSouce = MyKafkaUtil.getKafkaSource(favorInfoSourceTopic, groupId);
        FlinkKafkaConsumer<String> cartInfoSource = MyKafkaUtil.getKafkaSource(cartInfoSourceTopic, groupId);
        FlinkKafkaConsumer<String> refundInfoSource = MyKafkaUtil.getKafkaSource(refundInfoSourceTopic, groupId);
        FlinkKafkaConsumer<String> commentInfoSource = MyKafkaUtil.getKafkaSource(commentInfoSourceTopic, groupId);

        DataStreamSource<String> pageViewDStream = env.addSource(pageViewSource);
        DataStreamSource<String> favorInfoDStream = env.addSource(favorInfoSourceSouce);
        DataStreamSource<String> orderWideDStream = env.addSource(orderWideSource);
        DataStreamSource<String> paymentWideDStream = env.addSource(paymentWideSource);
        DataStreamSource<String> cartInfoDStream = env.addSource(cartInfoSource);
        DataStreamSource<String> refundInfoDStream = env.addSource(refundInfoSource);
        DataStreamSource<String> commentInfoDStream = env.addSource(commentInfoSource);

        //env.execute();

        // TODO: 2021/12/6  2.对获取的流数据进行结构的转换
        //2.1转换曝光及页面流数据
        SingleOutputStreamOperator<ProductStats> pageAndDispStatsDstream = pageViewDStream.process(
                new ProcessFunction<String, ProductStats>() {
                    @Override
                    public void processElement(String json, Context context, Collector<ProductStats> out) throws Exception {
                        JSONObject jsonObj = JSON.parseObject(json);
                        JSONObject pageJsonObj = jsonObj.getJSONObject("page");
                        String pageId = pageJsonObj.getString("page_id");
                        if (pageId != null) {
                            System.out.println(jsonObj);
                        }
                        Long ts = jsonObj.getLong("ts");
                        if (pageId.equals("good_detail")) {
                            Long skuId = pageJsonObj.getLong("item");
                            ProductStats productStats = ProductStats.builder().sku_id(skuId).
                                    click_ct(1L).ts(ts).build();
                            out.collect(productStats);

                        }

                        JSONArray displays = jsonObj.getJSONArray("displays");
                        if (displays != null && displays.size() > 0) {
                            for (int i = 0; i < displays.size(); i++) {
                                JSONObject display = displays.getJSONObject(i);
                                if (display.getString("item_type").equals("sku_id")) {
                                    Long skuId = display.getLong("item");
                                    ProductStats productStats = ProductStats.builder()
                                            .sku_id(skuId).display_ct(1L).ts(ts).build();
                                    out.collect(productStats);

                                }

                            }

                        }

                    }
                }
        );

        //2.2转换下单流数据
        SingleOutputStreamOperator<ProductStats> orderWideStatsDstream = orderWideDStream.map(
                json -> {
                    OrderWide orderWide = JSON.parseObject(json, OrderWide.class);
                    System.out.println("orderWide:===" + orderWide);
                    String create_time = orderWide.getCreate_time();
                    Long ts = DateTimeUtil.toTs(create_time);
                    return ProductStats.builder().sku_id(orderWide.getSku_id())
                            .orderIdSet(new HashSet(Collections.singleton(orderWide.getOrder_id())))
                            .order_sku_num(orderWide.getSku_num())
                            .order_amount(orderWide.getSplit_total_amount()).ts(ts).build();
                });

        //2.3转换收藏流数据
        SingleOutputStreamOperator<ProductStats> favorStatsDstream = favorInfoDStream.map(
                json -> {
                    JSONObject favorInfo = JSON.parseObject(json);
                    Long ts = DateTimeUtil.toTs(favorInfo.getString("create_time"));
                    return ProductStats.builder().sku_id(favorInfo.getLong("sku_id"))
                            .favor_ct(1L).ts(ts).build();
                });

        //2.4转换购物车流数据
        SingleOutputStreamOperator<ProductStats> cartStatsDstream = cartInfoDStream.map(
                json -> {
                    JSONObject cartInfo = JSON.parseObject(json);
                    Long ts = DateTimeUtil.toTs(cartInfo.getString("create_time"));
                    return ProductStats.builder().sku_id(cartInfo.getLong("sku_id"))
                            .cart_ct(1L).ts(ts).build();
                });

        //2.5转换支付流数据
        SingleOutputStreamOperator<ProductStats> paymentStatsDstream = paymentWideDStream.map(
                json -> {
                    PaymentWide paymentWide = JSON.parseObject(json, PaymentWide.class);
                    Long ts = DateTimeUtil.toTs(paymentWide.getPayment_create_time());
                    return ProductStats.builder().sku_id(paymentWide.getSku_id())
                            .payment_amount(paymentWide.getSplit_total_amount())
                            .paidOrderIdSet(new HashSet(Collections.singleton(paymentWide.getOrder_id())))
                            .ts(ts).build();
                });

        //2.6转换退款流数据
        SingleOutputStreamOperator<ProductStats> refundStatsDstream = refundInfoDStream.map(
                json -> {
                    JSONObject refundJsonObj = JSON.parseObject(json);
                    Long ts = DateTimeUtil.toTs(refundJsonObj.getString("create_time"));
                    ProductStats productStats = ProductStats.builder()
                            .sku_id(refundJsonObj.getLong("sku_id"))
                            .refund_amount(refundJsonObj.getBigDecimal("refund_amount"))
                            .refundOrderIdSet(new HashSet(Collections.singleton(refundJsonObj.getLong("order_id"))))
                            .ts(ts).build();
                    return productStats;

                });

        //2.7转换评价流数据
        SingleOutputStreamOperator<ProductStats> commonInfoStatsDstream = commentInfoDStream.map(
                json -> {
                    JSONObject commonJsonObj = JSON.parseObject(json);
                    Long ts = DateTimeUtil.toTs(commonJsonObj.getString("create_time"));
                    Long goodCt = GmallConstant.APPRAISE_GOOD.equals(commonJsonObj.getString("appraise")) ? 1L : 0L;
                    ProductStats productStats = ProductStats.builder()
                            .sku_id(commonJsonObj.getLong("sku_id"))
                            .comment_ct(1L).good_comment_ct(goodCt).ts(ts).build();
                    return productStats;
                });

        //TODO 3.把统一的数据结构流合并为一个流
        DataStream<ProductStats> productStatDetailDStream = pageAndDispStatsDstream.union(
                orderWideStatsDstream, cartStatsDstream,
                paymentStatsDstream, refundStatsDstream, favorStatsDstream,
                commonInfoStatsDstream);

        productStatDetailDStream.print("after union:");

    }

}
