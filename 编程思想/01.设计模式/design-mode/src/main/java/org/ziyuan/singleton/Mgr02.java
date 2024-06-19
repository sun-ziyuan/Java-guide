package org.ziyuan.singleton;

/**
 *
 * 饿汉式(静态代码块)
 *    类加载到内存后,就是实例化一个单例模式,JVM保证线程安全,推荐使用!
 *    唯一缺点: 不管用到与否, 类加载时就完成实例化(俗话说:你不用的,你装它干嘛),但是可能造成内存浪费
 * @author szy
 * @description
 * @date 2024/6/3 16:42
 */
public class Mgr02 {
    // 1. 定义一个静态实例
    private static final Mgr02 INSTANCE;

    // 2. 通过代码块进行初始化
    static {
        INSTANCE = new Mgr02();
    }

    // 3. 私有化构造方法
    private Mgr02(){}

    // 4. 对外提供一个静态方法获取对象
    public static Mgr02 getInstance(){
        return INSTANCE;
    }

    // 5. 测试
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr02.getInstance().hashCode());
            }).start();
        }
    }
}
