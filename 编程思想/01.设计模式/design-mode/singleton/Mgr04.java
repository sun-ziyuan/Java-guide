/**
 * 懒汉式(线程安全,同步方法):什么时候用,什么时候初始化
 *    虽然达到了按需初始化的目的，但却带来线程不安全的问题
 *    可以通过synchronized解决，但也带来效率下降
 * @author szy
 * @description 
 * @date 2024/6/3 19:16
 */
public class Mgr04 {
    // 1.定义一个静态实例
    private static Mgr04 INSTANCE;

    // 2. 对外提供静态方法获取对象
    public static synchronized Mgr04 getInstance(){
        if(INSTANCE == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    // 3. 测试
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }

}
