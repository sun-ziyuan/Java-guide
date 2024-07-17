package org.ziyuan.adapter.news.interface_adapter;

/**
 * 支付接口
 * @author szy
 * @description
 * @date 2024/7/17 15:57
 */
public interface PayGateway {

    // 下单
    void unifiedOrder();

    // 退款
    void refund();

    // 查询支付状态
    void query();

    // 发红包
    void sendRedPacket();
}
