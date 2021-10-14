package com.alibaba.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author fada.yu
 * @version 1.0
 * @date 2021/10/14 17:23
 * @Desc: 支付信息实体类
 */
@Data
public class PaymentInfo {
    Long id;
    Long order_id;
    Long user_id;
    BigDecimal total_amount;
    String subject;
    String payment_type;
    String create_time;
    String callback_time;
}
