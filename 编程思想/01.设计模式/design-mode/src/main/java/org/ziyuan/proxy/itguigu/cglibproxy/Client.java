package org.ziyuan.proxy.itguigu.cglibproxy;

/**
 * @author szy
 * @description
 * @date 2024/7/4 10:02
 */
public class Client {
    public static void main(String[] args) {
        // 1. 创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        // 2. 通过代理工厂创建代理对象,并且将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();

        // 3. 执行代理对象的方法,触发 intecept 方法, 从而实现对目标对象的调用
        String teach = proxyInstance.teach();
        System.out.println(teach);
    }
}
