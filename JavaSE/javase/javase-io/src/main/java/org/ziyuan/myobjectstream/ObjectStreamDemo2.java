package org.ziyuan.myobjectstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author szy
 * @description
 * @date 2024/6/19 15:10
 */
public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 需求: 利用反序列化流/对象操作输入流,把文件中的对象读取都按程序中
         * 构造方法: public ObjectInputStream(InputStream inp);     把基本流变成高级流
         * 成员方法: public Object readObject();        把序列化到本地文件中的对象, 读取到程序中来
         */

        // 1.创建反序列化流的对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("javase-io\\a.txt"));

        // 2.读取数据
        Student o = (Student) ois.readObject();
        System.out.println(o);

        // 3. 释放资源
        ois.close();
    }
}
