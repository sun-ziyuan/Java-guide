package org.ziyuan.factory.before;


/**
 * 咖啡店
 * @author szy
 * @description
 * @date 2024/6/4 17:37
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        // 1. 声明Coffee类型的变量,根据不同类型创建不同的coffee子类对象
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您点的咖啡没有");
        }
        // 添加配置
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
