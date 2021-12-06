package com.alibaba.common;

/**
 * @author fada.yu
 * @date 2021/8/7 15:53
 * @Description：
 */
public class GmallConfig {
    public static final String HBASE_SCHEMA = "GMALL2021_REALTIME";
    public static final String PHOENIX_SERVER = "jdbc:phoenix:hadoop202,hadoop203,hadoop204:2181";
    public static final String DEFAULT_TOPIC = "DEFAULT_DATA";
    public static final String CLICKHOUSE_URL="jdbc:clickhouse://hadoop202:8123/default";


}

