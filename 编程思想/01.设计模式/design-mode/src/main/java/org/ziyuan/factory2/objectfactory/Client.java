package org.ziyuan.factory2.objectfactory;

/**
 * @author sunziyuan
 * @date 2024/7/13 15:07
 */
public class Client {
    public static void main(String[] args) {
        // 简单工厂
        // 支付宝支付
        Pay aliPay = PayFactory.createPay("aliPay");
        aliPay.unifiedorder();
        // 微信支付
        Pay weChatPay = PayFactory.createPay("weChatPay");
        weChatPay.unifiedorder();
        // 贝宝支付
        Pay payPly = PayFactory.createPay("payPly");
        payPly.unifiedorder();


    }
}
