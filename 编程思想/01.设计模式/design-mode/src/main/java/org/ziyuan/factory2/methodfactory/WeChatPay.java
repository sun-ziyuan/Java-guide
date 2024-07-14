package org.ziyuan.factory2.methodfactory;

/**
 * @author sunziyuan
 * @date 2024/7/13 14:37
 */
public class WeChatPay implements Pay {
    @Override
    public void unifiedorder() {
        System.out.println("微信支付, 统一下单接口");
    }
}
