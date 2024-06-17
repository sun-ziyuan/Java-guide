package org.ziyuan.factory.sinple_factory;

/**
 * 咖啡类
 * @author szy
 * @description
 * @date 2024/6/4 17:14
 */
public abstract class Coffee {

    // 咖啡名称
    public abstract String getName();

    // 加糖
    public void addMilk(){
        System.out.println("加糖");
    }

    // 加奶
    public void addSugar(){
        System.out.println("加奶");
    }
}
