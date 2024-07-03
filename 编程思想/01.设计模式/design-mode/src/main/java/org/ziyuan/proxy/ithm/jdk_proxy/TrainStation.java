package org.ziyuan.proxy.ithm.jdk_proxy;

/**
 * 具体主题类: 火车站类
 * @author sunziyuan
 * @date 2024/7/1 21:08
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
