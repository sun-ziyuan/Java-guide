package org.ziyuan.factory.abstract_factory;

/**
 * 客户端
 * @author sunziyuan
 * @date 2024/6/7 07:03
 */
public class Client {
    public static void main(String[] args) {

        // 1. 创建甜品工厂对象
        DessertFacotry facotry = new AmericanDessertFactory();  // 意大利风味
        // 2. 获取咖啡和甜品
        Coffee coffee = facotry.createCoffee();// 拿铁咖啡
        Dessert dessert = facotry.createDessert();// 抹茶慕斯类

        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());
        dessert.show();
    }

}
