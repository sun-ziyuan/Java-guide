package org.ziyuan.factory.before;


/**
 * 测试类
 * @author szy
 * @description
 * @date 2024/6/4 17:47
 */
public class Client {
    public static void main(String[] args) {
        // 1. 创建咖啡店类
        CoffeeStore coffeeStore = new CoffeeStore();
        // 2. 点咖啡
        Coffee latte = coffeeStore.orderCoffee("latte");
        System.out.println(latte.getName());
    }
}
