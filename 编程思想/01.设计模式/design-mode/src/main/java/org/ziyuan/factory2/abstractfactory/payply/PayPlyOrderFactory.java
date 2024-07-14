package org.ziyuan.factory2.abstractfactory.payply;

import org.ziyuan.factory2.abstractfactory.OrderFactory;
import org.ziyuan.factory2.abstractfactory.PayFactory;
import org.ziyuan.factory2.abstractfactory.RefundFactory;

/**
 * @author sunziyuan
 * @date 2024/7/14 18:32
 */
public class PayPlyOrderFactory implements OrderFactory {
    @Override
    public PayFactory createPay() {
        return new PayPly();
    }

    @Override
    public RefundFactory createRefund() {
        return new PayPlyRefund();
    }
}
