package org.ziyuan.factory2.objectfactory;

/**
 * @author sunziyuan
 * @date 2024/7/13 14:37
 */
public class AliPay implements Pay{
    @Override
    public void unifiedorder() {
        System.out.println("支付宝支付, 统一下单接口");
    }
}
