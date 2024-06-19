package org.ziyuan.singleton;

/**
 * 枚举: 不仅可以解决线程同步,还可以防止反序列化
 * @author szy
 * @description 
 * @date 2024/6/3 19:29
 */
public enum Mgr08 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }

}
