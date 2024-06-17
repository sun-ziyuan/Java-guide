package org.ziyuan.singleton;

import java.io.*;

/**
 * 序列化反序列化: 下面代码运行结果是`false`，表明序列化和反序列化已经破坏了单例设计模式。
 * @author szy
 * @description
 * @date 2024/6/4 11:33
 */
public class Mgr09 implements Serializable {

    // 1. 私有化构造方法
    private Mgr09(){}

    // 2. 创建一个静态内部类
    private static class InstanceHelder{
        private static final Mgr09 INSTANCE = new Mgr09();
    }

    // 3. 对外提供静态方法获取该对象
    public static Mgr09 getInstance(){
        return InstanceHelder.INSTANCE;
    }

    /**
     * 下面是为了解决序列化反序列化破解单例模式
     */
    private Object readResolve() {
        return InstanceHelder.INSTANCE;
    }
}
class Mgr09Test {
    public static void main(String[] args) throws Exception {
        //往文件中写对象
//        writeObject2File();
        //从文件中读取对象
        Mgr09 s1 = readObjectFromFile();
        Mgr09 s2 = readObjectFromFile();

        //判断两个反序列化后的对象是否是同一个对象
        System.out.println(s1 == s2);
    }

    private static Mgr09 readObjectFromFile() throws Exception {
        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\sunzi\\Desktop\\a.txt"));
        //第一个读取Singleton对象
        Mgr09 instance = (Mgr09) ois.readObject();
        return instance;
    }

    public static void writeObject2File() throws Exception {
        //获取Singleton类的对象
        Mgr09 instance = Mgr09.getInstance();
        //创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\sunzi\\Desktop\\a.txt"));
        //将instance对象写出到文件中
        oos.writeObject(instance);
    }
}