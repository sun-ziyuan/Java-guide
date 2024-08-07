package org.ziyuan.proxy.ithm.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理对象工厂,用来获取代理对象
 * @author sunziyuan
 * @date 2024/7/1 22:14
 */
public class ProxyFactory implements MethodInterceptor {

    private TrainStation target = new TrainStation();

    public TrainStation getProxyObject(){
        // 创建Enhancer对象,类似于JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        TrainStation obj = (TrainStation) enhancer.create();

        return obj;
    }

    /**
     *
     * @param o             代理对象
     * @param method        真实对象中的方法的Method实例
     * @param objects       实际参数
     * @param methodProxy   代理对象中的方法的method实例
     */
    @Override
    public TrainStation intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理点收取一些服务费(CGLIB动态代理方式)");
        TrainStation result = (TrainStation) methodProxy.invokeSuper(o, objects);
        return result;
    }
}
