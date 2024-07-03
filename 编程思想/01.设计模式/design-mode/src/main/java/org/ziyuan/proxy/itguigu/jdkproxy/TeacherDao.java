package org.ziyuan.proxy.itguigu.jdkproxy;

/**
 * 被代理对象(目标对象)
 * @author sunziyuan
 * @date 2024/7/2 22:19
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师正在授课中...");
    }
}
