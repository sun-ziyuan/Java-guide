package org.ziyuan.factory2.abstractfactory;

/**
 * @author sunziyuan
 * @date 2024/7/14 17:43
 */
public class Client {
    public static void main(String[] args) {
        // 支付宝
        OrderFactory ali = FactoryProducer.getFactory("Ali");
        // 下单
        ali.createPay().unifiedorder();
        // 退款
        ali.createRefund().refund();

        // 微信
        OrderFactory weChat = FactoryProducer.getFactory("WeChat");
        // 下单
        weChat.createPay().unifiedorder();
        // 退款
        weChat.createRefund().refund();
    }
}
