package org.ziyuan.proxy.ithm.static_proxy;

/**
 * 客户端
 * @author sunziyuan
 * @date 2024/7/1 21:01
 */
public class Client {
    public static void main(String[] args) {
        // 1. 创建代售点类对象
        ProxyPoint proxyPoint = new ProxyPoint();
        // 2. 调用方法进行买票
        proxyPoint.sell();
    }
}
