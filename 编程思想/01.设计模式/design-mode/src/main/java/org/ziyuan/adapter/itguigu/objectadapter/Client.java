package org.ziyuan.adapter.itguigu.objectadapter;

/**
 * @author sunziyuan
 * @date 2024/7/10 23:06
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=====对象适配器模式======");
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter(new Voltage220()));
    }
}
