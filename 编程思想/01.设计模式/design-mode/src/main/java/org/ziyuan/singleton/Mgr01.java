package org.ziyuan.singleton;

/**
 *
 * 饿汉式(静态常量)
 *    类加载到内存后,就是实例化一个单例模式,JVM保证线程安全,推荐使用!
 *    唯一缺点: 不管用到与否, 类加载时就完成实例化(俗话说:你不用的,你装它干嘛),但是可能造成内存浪费
 * @author szy
 * @description
 * @date 2024/6/3 15:58
 */
public class Mgr01 {

    // 1. 定义一个静态实例
    private static final Mgr01 INSTANCE = new Mgr01();

    // 2. 私有化构造方法
    private Mgr01(){}

    // 3. 对外提供静态方法获取对象
    public static Mgr01 getInstance(){
        return INSTANCE;
    }

    // 4. 测试
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr01.getInstance().hashCode());
            }).start();
        }
    }
}
