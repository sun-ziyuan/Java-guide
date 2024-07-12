package org.ziyuan.proxy.itguigu.cglibproxy;

/**
 * 被代理对象
 * @author szy
 * @description
 * @date 2024/7/4 9:48
 */
public class TeacherDao {
    public String teach(){
        System.out.println("老师授课中...");
        return "Goods";
    }
}
