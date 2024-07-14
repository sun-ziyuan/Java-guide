package org.ziyuan.factory2.abstractfactory.ali;

import org.ziyuan.factory2.abstractfactory.RefundFactory;

/**
 * @author sunziyuan
 * @date 2024/7/14 17:29
 */
public class AliRefund implements RefundFactory {
    @Override
    public void refund() {
        System.out.println("支付宝支付 退款~~~");
    }
}
