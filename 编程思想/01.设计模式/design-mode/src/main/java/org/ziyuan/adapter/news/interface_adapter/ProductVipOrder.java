package org.ziyuan.adapter.news.interface_adapter;

/**
 * @author sunziyuan
 * @date 2024/7/17 23:11
 */
public class ProductVipOrder extends PayGatewayAdapter{
    @Override
    public void query() {
        System.out.println("查询订单~~");
    }

    @Override
    public void sendRedPacket() {
        System.out.println("发红包~~");
    }
}
