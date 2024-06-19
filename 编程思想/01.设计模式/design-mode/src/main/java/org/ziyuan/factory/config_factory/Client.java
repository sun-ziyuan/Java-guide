package org.ziyuan.factory.config_factory;

/**
 * 客户端
 * @author sunziyuan
 * @date 2024/6/9 11:16
 */
public class Client {
    public static void main(String[] args) {
        Coffee american = CoffeeFactory.createCoffee("american");
        System.out.println(american.getName());
        System.out.println("----------------------------------------------------------------");
        Coffee coffee = CoffeeFactory.createCoffee("latte");
        System.out.println(coffee.getName());
    }
}
