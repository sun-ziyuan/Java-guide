package org.ziyuan.singleton2;

/**
 * 饿汉式：类加载时，会创建该类的实例对象,JVM保证线程安全,有三种: 静态常量、静态代码块、枚举
 * @author sunziyuan
 * @date 2024/7/6 10:10
 */
public class Mgr2 {
    // 1. 定义一个静态实例
    private static final Mgr2 INSTANCE;
    // 2. 静态初始化
    static {
        INSTANCE = new Mgr2();
    }

    // 3. 私有化构造器
    private Mgr2(){}

    // 4. 对外提供一个静态方法方方法该对象
    public static Mgr2 getInstance(){
        return INSTANCE;
    }
}
