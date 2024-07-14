package org.ziyuan.factory2.abstractfactory.payply;

import org.ziyuan.factory2.abstractfactory.RefundFactory;

/**
 * @author sunziyuan
 * @date 2024/7/14 17:29
 */
public class PayPlyRefund implements RefundFactory {
    @Override
    public void refund() {
        System.out.println("Payply支付 退款~~~");
    }
}
