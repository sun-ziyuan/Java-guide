package org.ziyuan.proxy.ithm.static_proxy;

/**
 * 代理类: 代售点类
 * @author sunziyuan
 * @date 2024/7/1 20:58
 */
public class ProxyPoint implements SellTickets{
    // 声明火车站类对象
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取一些服务费用");
        trainStation.sell();
    }
}
