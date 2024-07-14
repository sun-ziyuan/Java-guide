package org.ziyuan.factory2.abstractfactory.ali;

import org.ziyuan.factory2.abstractfactory.OrderFactory;
import org.ziyuan.factory2.abstractfactory.PayFactory;
import org.ziyuan.factory2.abstractfactory.RefundFactory;

/**
 * @author sunziyuan
 * @date 2024/7/14 17:27
 */
public class AliOrderFactory implements OrderFactory {
    @Override
    public PayFactory createPay() {
        return new AliPay();
    }

    @Override
    public RefundFactory createRefund() {
        return new AliRefund();
    }
}
