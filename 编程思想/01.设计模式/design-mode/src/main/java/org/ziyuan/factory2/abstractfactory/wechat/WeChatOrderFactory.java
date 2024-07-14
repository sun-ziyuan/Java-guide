package org.ziyuan.factory2.abstractfactory.wechat;


import org.ziyuan.factory2.abstractfactory.OrderFactory;
import org.ziyuan.factory2.abstractfactory.PayFactory;
import org.ziyuan.factory2.abstractfactory.RefundFactory;

/**
 * @author sunziyuan
 * @date 2024/7/14 17:36
 */
public class WeChatOrderFactory implements OrderFactory {
    @Override
    public PayFactory createPay() {
        return new WeChatPay();
    }

    @Override
    public RefundFactory createRefund() {
        return new WeChatRefund();
    }
}
