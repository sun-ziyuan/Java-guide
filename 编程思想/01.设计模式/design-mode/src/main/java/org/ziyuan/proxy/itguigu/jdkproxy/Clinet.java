package org.ziyuan.proxy.itguigu.jdkproxy;

/**
 * @author sunziyuan
 * @date 2024/7/2 22:36
 */
public class Clinet {
    public static void main(String[] args) {
        // 1. 创建一个目标对象
        ITeacherDao target = new TeacherDao();
        // 2. 给目标对象创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        // 3. proxyInstance=class com.sun.proxy.$Proxy0  内存中动态生成了代理对象
        System.out.println("proxyInstance="+proxyInstance.getClass());
        proxyInstance.teach();
        //proxyInstance.sayHello("tom");

    }
}
