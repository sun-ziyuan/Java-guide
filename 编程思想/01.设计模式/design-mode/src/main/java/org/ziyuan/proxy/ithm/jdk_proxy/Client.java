package org.ziyuan.proxy.ithm.jdk_proxy;

/**
 * @author sunziyuan
 * @date 2024/7/1 21:27
 */
public class Client {
    public static void main(String[] args) {
        // 获取代理对象
        // 1. 创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        // 2. 使用factory对象的方法获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        // 3. 调用   卖电脑的方法
        proxyObject.sell();
    }
}
