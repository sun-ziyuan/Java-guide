package org.ziyuan.proxy.ithm.static_proxy;

/**
 * 具体主题类: 火车站类
 * @author sunziyuan
 * @date 2024/7/1 20:57
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站买票");
    }
}
