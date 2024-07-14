package org.ziyuan.factory2.methodfactory;

/**
 * @author sunziyuan
 * @date 2024/7/13 17:15
 */
public class Clinet {
    public static void main(String[] args) {
        // 支付宝支付
        PayFactory aliPayFactory = new AliPayFactory();
        aliPayFactory.getPay().unifiedorder();

        // 微信支付
        PayFactory weChatPayFactory = new WeChatPayFactory();
        weChatPayFactory.getPay().unifiedorder();

        // PayPly支付
        PayFactory payPlyFactory = new PayPlyFactory();
        payPlyFactory.getPay().unifiedorder();

    }
}
