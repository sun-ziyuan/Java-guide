package org.ziyuan.singleton2;

import java.awt.*;

/**
 * 静态内部方法: JVM保证单例,加载外部类时不会加载内部类,这样可以实现懒加载;
 * @author szy
 * @description
 * @date 2024/7/12 17:16
 */
public class Mgr6 {
    // 1. 私有化构造方法
    private Mgr6(){}

    // 2. 创建一个私有静态内部类
    private static class SingletonHolder{
        private static final Mgr6 INSTANCE = new Mgr6();
    }

    // 3. 对外提供静态方法获取该对象
    public static Mgr6 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
