package org.ziyuan.adapter.news.object_adapter;

/**
 * @author szy
 * @description
 * @date 2024/7/18 14:50
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=====对象适配器模式======");
        IVoltage5V iVoltage5V = new VoltageAdapter(new Voltage220V());
        iVoltage5V.output5V();
    }
}
