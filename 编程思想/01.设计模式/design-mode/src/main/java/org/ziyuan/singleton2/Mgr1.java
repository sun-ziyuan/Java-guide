package org.ziyuan.singleton2;

/**
 * 饿汉式: 类加载时，就会创建该类的实例对象,JVM会保证线程的安全，饿汉式有三种：静态常量、静态代码块、枚举
 * @author sunziyuan
 * @date 2024/7/6 09:45
 */
public class Mgr1 {
    // 1. 定义一个静态实例
    private static final Mgr1 INSTANCE = new Mgr1();

    // 2. 私有化构造器
    private Mgr1(){}

    // 3. 对外提供一个静态方法获取该对象
    public static Mgr1 getInstance(){
        return INSTANCE;
    }
}
