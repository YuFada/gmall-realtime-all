package com.alibaba.bean;

import lombok.Data;

/**
 * @author fada.yu
 * @date 2021/8/7 14:54
 * @Description：
 *
 * CREATE TABLE `table_process` (
 *   `source_table` varchar(200) NOT NULL COMMENT '来源表',
 *   `operate_type` varchar(200) NOT NULL COMMENT '操作类型 insert,update,delete',
 *    `sink_type` varchar(200) DEFAULT NULL COMMENT '输出类型 hbase kafka',
 *   `sink_table` varchar(200) DEFAULT NULL COMMENT '输出表(主题)',
 *   `sink_columns` varchar(2000) DEFAULT NULL COMMENT '输出字段',
 *   `sink_pk` varchar(200) DEFAULT NULL COMMENT '主键字段',
 *   `sink_extend` varchar(200) DEFAULT NULL COMMENT '建表扩展',
 *   PRIMARY KEY (`source_table`,`operate_type`)
 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8
 */
@Data
public class TableProcess {
    //动态分流Sink常量   改为小写和脚本一致
    public static final String SINK_TYPE_HBASE = "hbase";
    public static final String SINK_TYPE_KAFKA = "kafka";
    public static final String SINK_TYPE_CK = "clickhouse";
    //来源表
    String sourceTable;
    //操作类型 insert,update,delete
    String operateType;
    //输出类型 hbase kafka
    String sinkType;
    //输出表(主题)
    String sinkTable;
    //输出字段
    String sinkColumns;
    //主键字段
    String sinkPk;
    //建表扩展
    String sinkExtend;
}
