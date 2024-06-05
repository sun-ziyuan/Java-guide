/**
 * 懒汉式(双重检查锁):
 *      双重检查锁会出现空指针问题，出现问题的原因是JVM在实例化对象的时候会进行优化和指令重排序操作。
 *      解决办法：要解决双重检查锁模式带来空指针异常的问题，只需要使用 `volatile` 关键字, `volatile` 关键字可以保证可见性和有序性。
 *
 * @author szy
 * @description 
 * @date 2024/6/3 20:05
 */
public class Mgr06 {
    // 1. 定义一个静态实例
    private static Mgr06 INSTANCE;

    // 2. 对外提供一个静态方法获取对象
    public static Mgr06 getInstance(){
        if(INSTANCE == null){
            // 视图通过减小同步代码块的方式,提高效率,然后不可行
            synchronized (Mgr06.class){
                if(INSTANCE == null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

    // 3. 测试
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();
        }
    }
}
