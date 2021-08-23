
package com.alibaba.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author fada.yu
 * @date 2021/8/21 15:30
 * @Description：
 * 订单明细实体类
 */
@Data
public class OrderDetail {
    Long id;
    Long order_id ;
    Long sku_id;
    BigDecimal order_price ;
    Long sku_num ;
    String sku_name;
    String create_time;
    BigDecimal split_total_amount;
    BigDecimal split_activity_amount;
    BigDecimal split_coupon_amount;
    Long create_ts;

}
