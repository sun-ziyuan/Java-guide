package org.ziyuan.factory2.methodfactory;

/**
 * @author sunziyuan
 * @date 2024/7/13 17:15
 */
public class WeChatPayFactory implements PayFactory{
    @Override
    public Pay getPay() {
        return new WeChatPay();
    }
}
