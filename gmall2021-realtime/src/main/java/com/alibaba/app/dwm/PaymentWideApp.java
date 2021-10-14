package com.alibaba.app.dwm;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * @author fada.yu
 * @version 1.0
 * @date 2021/10/14 19:05
 * @Desc: 支付宽表处理主程序
 */
public class PaymentWideApp {
    public static void main(String[] args) {
        //TODO 0.基本环境准备
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(4);
    }
}
