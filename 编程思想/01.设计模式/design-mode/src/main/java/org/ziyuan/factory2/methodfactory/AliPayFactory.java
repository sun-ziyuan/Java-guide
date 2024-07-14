package org.ziyuan.factory2.methodfactory;

/**
 * @author sunziyuan
 * @date 2024/7/13 17:11
 */
public class AliPayFactory implements PayFactory{
    @Override
    public Pay getPay() {
        return new AliPay();
    }
}
