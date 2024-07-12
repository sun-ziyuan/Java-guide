package org.ziyuan.singleton2;

/**
 * 双重检查锁（DCL,Double-Checked-Locking）,在多线程情况下保持高性能
 * 问题: 双重检查锁会出现空指针问题，出现问题的原因是JVM在实例化对象的时候会进行优化和指令重排序操作
 * 解决办法：
 *   要解决双重检查锁模式带来空指针异常的问题，只需要使用 volatile 关键字.
 *	 volatile是Java提供的关键字,它具有可见性和有序性,可以禁止指令重排
 *
 * @author szy
 * @description
 * @date 2024/7/12 16:32
 */
public class Mgr5 {

    // 1. 创建一个静态实例
    private static volatile Mgr5 instance;

    // 2. 私有化构造器
    private Mgr5(){}

    // 3. 对外提供静态方法获取该实例对象
    public static Mgr5 getInstance(){
        // 第一重检查
        if(instance == null){
            // A,B锁定
            synchronized (Mgr5.class){
                // 第二重检查
                if(instance == null){
                    instance = new Mgr5();
                }
            }
        }
        return instance;
    }

}
