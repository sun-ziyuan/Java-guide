package org.ziyuan.prototype.impove;


/**
 * @author szy
 * @description 客户端
 * @date 2024/6/24 17:33
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        System.out.println(sheep);

        // 传统的方法:循环克隆9个对象
        for (int i = 1; i < 10; i++) {
            Sheep s = sheep.clone();
            System.out.println(s);
        }
        System.out.println(sheep);
    }
}
