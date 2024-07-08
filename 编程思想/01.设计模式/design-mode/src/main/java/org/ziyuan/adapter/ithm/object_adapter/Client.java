package org.ziyuan.adapter.ithm.object_adapter;

/**
 * @author sunziyuan
 * @date 2024/7/6 17:52
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // 读取
        System.out.println(computer.readSD(new SDCardImpl()));

        System.out.println("--------------------------------");
        TFCard tfCard = new TFCardImpl();
        SDApapterTF sdApapterTF = new SDApapterTF(tfCard);
        System.out.println(sdApapterTF.readSD());


    }
}
