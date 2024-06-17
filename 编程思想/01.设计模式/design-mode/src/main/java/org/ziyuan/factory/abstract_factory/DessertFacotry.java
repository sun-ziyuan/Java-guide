package org.ziyuan.factory.abstract_factory;

/**
 * 抽象工厂类
 * @author sunziyuan
 * @date 2024/6/7 06:53
 */
public interface DessertFacotry {
    // 生产咖啡的功能
    Coffee createCoffee();
    // 生成甜品的功能
    Dessert createDessert();
}
