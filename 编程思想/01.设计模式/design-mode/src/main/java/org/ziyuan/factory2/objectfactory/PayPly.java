package org.ziyuan.factory2.objectfactory;

/**
 * @author sunziyuan
 * @date 2024/7/13 14:58
 */
public class PayPly implements Pay{
    @Override
    public void unifiedorder() {
        System.out.println("PayPly支付, 统一下单接口");
    }
}
