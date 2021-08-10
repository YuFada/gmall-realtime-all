package com.alibaba.app.func;

import com.alibaba.common.GmallConfig;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Set;


/**
 * @author fada.yu
 * @version 1.0
 * @date 2021/8/10 15:45
 * @Desc:
 * 通过Phoenix向Hbase表中写数据
 */
public class DimSink extends RichSinkFunction<JSONObject> {
    Connection connection=null;

    @Override
    public void open(Configuration parameters) throws Exception {
        Class.forName("org.apache.phoenix.jdbc.PhoenixDriver");
        connection= DriverManager.getConnection(GmallConfig.PHOENIX_SERVER);
        super.open(parameters);
    }

    /**
     * 生成语句提交hbase
     * @param jsonObject
     * @param context
     * @throws Exception
     */
    @Override
    public void invoke(JSONObject jsonObject, Context context) throws Exception {

        String tableName = jsonObject.getString("sink_table");
        JSONObject dataJsonObj = jsonObject.getJSONObject("data");
        if (dataJsonObj != null && dataJsonObj.size() > 0) {
            String upsertSql = genUpsertSql(tableName.toUpperCase(), jsonObject.getJSONObject("data"));
            try {
                System.out.println(upsertSql);
                PreparedStatement ps = connection.prepareStatement(upsertSql);
                ps.executeUpdate();
                connection.commit();
                ps.close();
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("执行sql失败！");
            }
        }
    }
    public String genUpsertSql(String tableName, JSONObject jsonObject) {
        Set<String> fields = jsonObject.keySet();
        String upsertSql = "upsert into " + GmallConfig.HBASE_SCHEMA + "." + tableName + "(" + StringUtils.join(fields, ",") + ")";
        String valuesSql = " values ('" + StringUtils.join(jsonObject.values(), "','") + "')";
        return upsertSql + valuesSql;
    }


    @Override
    public void close() throws Exception {
        super.close();
    }

}
