package org.ziyuan.proxy.itguigu.staticproxy;

/**
 * @author szy
 * @description 被代理对象
 * @date 2024/7/2 9:57
 */
public class TeacherDao implements ITeacherDao{

    @Override
    public void teach() {
        System.out.println(" 老师授课中...");
    }
}
