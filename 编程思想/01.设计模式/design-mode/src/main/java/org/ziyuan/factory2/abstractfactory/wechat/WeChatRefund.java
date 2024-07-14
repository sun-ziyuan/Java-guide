package org.ziyuan.factory2.abstractfactory.wechat;

import org.ziyuan.factory2.abstractfactory.RefundFactory;

/**
 * @author sunziyuan
 * @date 2024/7/14 17:36
 */
public class WeChatRefund implements RefundFactory {
    @Override
    public void refund() {
        System.out.println("微信支付退款~~");
    }
}
