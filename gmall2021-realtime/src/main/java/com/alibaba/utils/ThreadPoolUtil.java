package com.alibaba.utils;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author fada.yu
 * @version 1.0
 * @date 2021/10/13 18:03
 * @Desc:
 * Flink 在1.2中引入了Async I/O，在异步模式下，将IO操作异步化，单个并行可以连续发送多个请求，
 * 哪个请求先返回就先处理，从而在连续的请求间不需要阻塞式等待，大大提高了流处理效率。
 * Async I/O 是阿里巴巴贡献给社区的一个呼声非常高的特性，解决与外部系统交互时网络延迟成为了系统瓶颈的问题。
 *
 * 线程池工具类
 */
public class ThreadPoolUtil {

    public static ThreadPoolExecutor pool;

     /*
    获取单例的线程池对象
    corePoolSize:指定了线程池中的线程数量，它的数量决定了添加的任务是开辟新的线程去执行，还是放到workQueue任务队列中去；
    maximumPoolSize:指定了线程池中的最大线程数量，这个参数会根据你使用的workQueue任务队列的类型，决定线程池会开辟的最大线程数量；
    keepAliveTime:当线程池中空闲线程数量超过corePoolSize时，多余的线程会在多长时间内被销毁；
    unit:keepAliveTime的单位
    workQueue:任务队列，被添加到线程池中，但尚未被执行的任务
    */

    public static ThreadPoolExecutor getInstance() {
        if (pool == null) {
            synchronized (ThreadPoolUtil.class) {
                if (pool == null) {
                    System.out.println ("开辟程池！！！！！");
                    pool=new ThreadPoolExecutor(4, 20, 300, TimeUnit.SECONDS,
                            new LinkedBlockingDeque<Runnable>(Integer.MAX_VALUE));
                }
            }
        }
        return pool;
    }
}
