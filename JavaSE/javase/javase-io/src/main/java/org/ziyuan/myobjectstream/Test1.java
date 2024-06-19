package org.ziyuan.myobjectstream;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author szy
 * @description
 * @date 2024/6/19 16:33
 */
public class Test1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        oss();
        ois();
    }

    public static void oss() throws IOException {
        // 1. 创建学生对象
        List<Student> list = Arrays.asList(
                new Student("老王", 18),
                new Student("老张", 20),
                new Student("老李", 22));
        // 2. 创建序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("javase-io\\list.txt"));
        // 3. 写出对象
        oos.writeObject(list);
        // 4. 释放资源
        oos.close();
    }

    public static void ois() throws IOException, ClassNotFoundException {
        // 1. 创建反序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("javase-io\\list.txt"));
        // 2. 读取数据
        List<Student> o = (List<Student>) ois.readObject();
        o.forEach(System.out::println);
        // 3. 释放资源
        ois.close();
    }
}
