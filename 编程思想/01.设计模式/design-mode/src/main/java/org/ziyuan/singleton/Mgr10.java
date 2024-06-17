package org.ziyuan.singleton;

import java.lang.reflect.Constructor;

/**
 * 下面代码运行结果是`false`，表明反射已经破坏了单例设计模式
 * @author szy
 * @description
 * @date 2024/6/4 14:09
 */
public class Mgr10 {

    // 1. 私有化构造方法
    private Mgr10(){
        // 反射破解单例模式需要添加的代码
        if(InstanceHandle.INSTANCE!=null){
            throw new RuntimeException();
        }
    }

    // 2. 创建一个静态内部类
    public static class InstanceHandle{
        private static final Mgr10 INSTANCE = new Mgr10();
    }

    // 3. 对外提供静态方法获取对象
    public static Mgr10 getInstance(){
        return InstanceHandle.INSTANCE;
    }
}
class Mgr10Test{
    public static void main(String[] args) throws Exception{
        // 1. 获取Mgr10的字节码文件
        Class mgr10Class = Mgr10.class;
        // 2. 获取Mgr10类的私有无参构造方法对象
        Constructor declaredConstructor = mgr10Class.getDeclaredConstructor();
        // 取消访问检查
        declaredConstructor.setAccessible(true);


        // 创建Mgr10类的对象
        Mgr10 s1 = (Mgr10) declaredConstructor.newInstance();
        Mgr10 s2 = (Mgr10) declaredConstructor.newInstance();

        System.out.println(s1==s2);

    }
}


