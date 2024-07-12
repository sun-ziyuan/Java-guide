package org.ziyuan.singleton2;

/**
 * 懒汉式: 随着类的加载而加载,首次使用时创建该累的实例化对象,有五种:
 *      线程不安全：线程不安全,同步代码块
 *      线程 安全： 同步方法,双重检查,静态内部类
 * @author sunziyuan
 * @date 2024/7/6 10:17
 */
public class Mgr4 {
    // 1. 定义一个静态实例
    private static Mgr4 INSTANCE;

    // 2. 私有化构造器
    private Mgr4(){}

    // 3. ① 对外提供一个静态方法获取该对象
//    public static Mgr4 getINstance(){
//        if(INSTANCE == null){
//            INSTANCE = new Mgr4();
//        }
//        return INSTANCE;
//    }

    // 3. ② 同步代码块
//    public static Mgr4 getInstance(){
//        if(INSTANCE == null){
//            synchronized (Mgr4.class){
//                INSTANCE = new Mgr4();
//            }
//        }
//        return INSTANCE;
//    }

    // 3. ③ 同步方法,线程安全
    public static synchronized Mgr4 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Mgr4();
        }
        return INSTANCE;
    }

}
