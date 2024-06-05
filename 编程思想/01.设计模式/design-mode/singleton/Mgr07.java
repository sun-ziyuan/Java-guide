/**
 * 静态内部方法
 *   JVM保证单例,加载外部类时不会加载内部类,这样可以实现懒加载;
 * @author szy
 * @description 
 * @date 2024/6/3 19:30
 */
public class Mgr07 {
    // 1. 私有化构造方法
    private Mgr07(){}

    // 2. 创建一个静态内部类
    private static class SingletonHolder{
        private static final Mgr07 INSTANCE = new Mgr07();
    }

    // 3. 对外提供静态方法获取该对象
    public static Mgr07 getInstance(){
        return SingletonHolder.INSTANCE;
    }

    // 4. 测试
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr07.getInstance().hashCode());
            }).start();
        }
    }
}
