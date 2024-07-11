package org.ziyuan.adapter.itguigu.classadapter;

/**
 * @author sunziyuan
 * @date 2024/7/10 22:36
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=====类适配器模式======");
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter());
    }
}
