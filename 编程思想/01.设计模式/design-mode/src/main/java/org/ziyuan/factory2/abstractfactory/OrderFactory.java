package org.ziyuan.factory2.abstractfactory;

/**
 * 超级工厂
 * @author sunziyuan
 * @date 2024/7/14 17:15
 */
public interface OrderFactory {
    // 支付
    PayFactory createPay();
    // 退款
    RefundFactory createRefund();
}
