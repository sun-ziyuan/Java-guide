package org.ziyuan.factory.static_factory;

/**
 * 简单工厂
 * @author szy
 * @description
 * @date 2024/6/5 14:18
 */
public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type){
        // 1. 声明Coffee类型的变量,根据不同类型创建不同的coffee子类对象
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您点的咖啡没有");
        }
        return coffee;
    }
}
