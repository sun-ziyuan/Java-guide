package org.ziyuan.singleton;

/**
 * 懒汉式(线程不安全,同步代码块):什么时候用,什么时候初始化
 *    虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * @author szy
 * @description 
 * @date 2024/6/3 19:21
 */
public class Mgr05 {
    // 1. 定义一个静态实例
    private static Mgr05 INSTANCE;
    // 2. 私有化构造器
    private Mgr05(){}

    // 3. 对外提供一个静态方法获取对象
    public static Mgr05 getInstance(){
        if(INSTANCE == null){
            // 视图通过减小同步代码块的方式,提高效率,然后不可行
            synchronized (Mgr05.class){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }

    // 3. 测试
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }
}
