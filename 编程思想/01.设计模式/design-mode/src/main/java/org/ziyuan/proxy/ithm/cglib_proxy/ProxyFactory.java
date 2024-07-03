package org.ziyuan.proxy.ithm.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * 代理对象工厂,用来获取代理对象
 * @author sunziyuan
 * @date 2024/7/1 22:14
 */
public class ProxyFactory {

    public TrainStation getProxyObject(){
        // 创建Enhancer对象,类似于JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数
        //enhancer.setCallback();
        // 创建代理对象

        return null;
    }
}
