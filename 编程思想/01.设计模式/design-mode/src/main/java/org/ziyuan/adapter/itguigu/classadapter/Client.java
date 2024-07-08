package org.ziyuan.adapter.itguigu.classadapter;

/**
 * @author sunziyuan
 * @date 2024/7/9 06:29
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=====类适配器模式======");
        Phone phone = new Phone();
        phone.charing(new VoltageAdapter());
    }
}
