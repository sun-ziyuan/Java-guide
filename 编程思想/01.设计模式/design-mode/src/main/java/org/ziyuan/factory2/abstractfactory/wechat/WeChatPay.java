package org.ziyuan.factory2.abstractfactory.wechat;

import org.ziyuan.factory2.abstractfactory.PayFactory;

/**
 * @author sunziyuan
 * @date 2024/7/13 14:37
 */
public class WeChatPay implements PayFactory {
    @Override
    public void unifiedorder() {
        System.out.println("微信支付, 统一下单接口");
    }
}
