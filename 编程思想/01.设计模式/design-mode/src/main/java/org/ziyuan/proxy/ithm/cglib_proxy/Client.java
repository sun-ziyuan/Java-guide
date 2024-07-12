package org.ziyuan.proxy.ithm.cglib_proxy;

/**
 * @author szy
 * @description
 * @date 2024/7/4 9:27
 */
public class Client {
    public static void main(String[] args) {
        // 创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        // 获取代理对象
        TrainStation proxyObject = proxyFactory.getProxyObject();

        proxyObject.sell();
    }
}
