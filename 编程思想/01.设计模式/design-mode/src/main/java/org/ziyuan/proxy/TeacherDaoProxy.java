package org.ziyuan.proxy;

/**
 * @author szy
 * @description 代理对象
 * @date 2024/7/2 9:57
 */
public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao iTeacherDao;    // 目标对象,通过接口聚合

    // 构造器
    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }


    @Override
    public void teach() {
        System.out.println("准备授课...");
        iTeacherDao.teach();
        System.out.println("结束授课...");
    }
}
