package com.alibaba.bean;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author fada.yu
 * @version 1.0
 * @date 2021/12/6 14:38
 * @Desc: C.创建TransientSink注解，该注解标记不需要保存的字段
 * 由于之前的ClickhouseUtil工具类的写入机制就是把该实体类的所有字段按次序一次写入数据表。但是实体类有时会用到一些临时字段，
 * 计算中有用但是并不需要最终保存在临时表中。我们可以把这些字段做一些标识，然后再写入的时候判断标识来过滤掉这些字段。
 * 为字段打标识通常的办法就是给字段加个注解，这里我们就增加一个自定义注解@TransientSink来标识该字段不需要保存到数据表中。
 * <p>
 * 向ClickHouse写入数据的时候，如果有字段数据不需要传输，可以用该注解标记
 */
@Target(FIELD)
@Retention(RUNTIME)
public @interface TransientSink {
}
