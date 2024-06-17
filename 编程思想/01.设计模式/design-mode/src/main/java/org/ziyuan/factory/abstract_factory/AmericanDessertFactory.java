package org.ziyuan.factory.abstract_factory;

/**
 * 美式风味的甜品工厂
 *      生产: 美式咖啡、抹茶慕斯
 * @author sunziyuan
 * @date 2024/6/7 06:55
 */
public class AmericanDessertFactory implements DessertFacotry{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
