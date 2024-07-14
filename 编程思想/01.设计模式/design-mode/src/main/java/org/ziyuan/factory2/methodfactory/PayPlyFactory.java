package org.ziyuan.factory2.methodfactory;

/**
 * @author sunziyuan
 * @date 2024/7/13 17:13
 */
public class PayPlyFactory implements PayFactory{
    @Override
    public Pay getPay() {
        return new PayPly();
    }
}
