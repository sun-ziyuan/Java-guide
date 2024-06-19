package org.ziyuan.singleton;

/**
 * 懒汉式(线程不安全): 什么时候用,什么时候初始化
 *   虽然也达到了按需初始化的目的,但却带来线程不安全的问题
 * @author szy
 * @description 
 * @date 2024/6/3 19:01
 */
public class Mgr03 {
    // 1. 定义一个静态实例
    private static Mgr03 INSTANCE;

    // 2. 对外提供静态方法获取对象
    public static Mgr03 getInstance(){
        if(INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            INSTANCE = new Mgr03();

        }
        return INSTANCE;
    }

    // 3. 测试
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }
}
