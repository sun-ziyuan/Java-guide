package org.ziyuan.factory2.abstractfactory.payply;

import org.ziyuan.factory2.abstractfactory.PayFactory;

/**
 * @author sunziyuan
 * @date 2024/7/13 14:58
 */
public class PayPly implements PayFactory {
    @Override
    public void unifiedorder() {
        System.out.println("PayPly支付, 统一下单接口");
    }
}
