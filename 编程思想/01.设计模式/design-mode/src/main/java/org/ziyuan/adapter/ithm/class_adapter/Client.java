package org.ziyuan.adapter.ithm.class_adapter;

/**
 * 测试类
 * @author sunziyuan
 * @date 2024/7/6 13:02
 */
public class Client {
    public static void main(String[] args) {
        // 1. 创建计算机对象
        Computer computer = new Computer();
        // 2. 读取SD卡中的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("================================================");
        // 使用该电脑读取TF卡的数据
        // 定义适配器类
        String msg1 = computer.readSD(new SDAdapterTF());
        System.out.println(msg1);



    }
}
