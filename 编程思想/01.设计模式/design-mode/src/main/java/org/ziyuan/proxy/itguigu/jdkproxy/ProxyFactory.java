package org.ziyuan.proxy.itguigu.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * 代理工厂
 * @author sunziyuan
 * @date 2024/7/2 22:21
 */
public class ProxyFactory {

    // 维护一个目标对象
    private Object target;
    // 构造器: 对 target 进行初始化

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 给目标对象生成一个代理对象
    public Object getProxyInstance(){
        /**
         * ClassLoader loader    : 指定当前目标对象使用的类加载器,获取加载器的方法固定
         * Class<?>[] interfaces : 目标对象(被代理对象),实现的接口类型,使用泛型方法确认类型
         * InvocationHandler h   : 代理对象的调用处理程序,执行目标对象的方法时,会触发事件处理器方法,会把当前执行的目标对象方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                /**
                 * Object proxy:  代理对象,在invoke方法中基本不用
                 * Method method: 对应于在代理对象上调用的接口方法的 Method 实例
                 * Object[] args: 代理对象调用接口方法时传递的实际参数
                 * 返回值: 方法的返回值
                 */
                (proxy, method, args)->{
                    System.out.println("JDK代理开始~~");
                    // 反射机制调用目标对象
                    Object returnVal = method.invoke(target, args);
                    System.out.println("JDK代理提交~~");
                    return returnVal;
                }
        );
    }
}
