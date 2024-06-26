package org.ziyuan.prototype.deepcopy;

import java.io.*;

/**
 * @author szy
 * @description
 * @date 2024/6/26 9:20
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        // 1. 创建原型对象
        Citation citation = new Citation();
        // 创建张三对象
        Student student = new Student("张三");
        citation.setStudent(student);

        // 2. 克隆奖状对象

        // 创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        // 写对象
        oos.writeObject(citation);
        // 释放资源
        oos.close();


        // 创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        // 获取对象
        Citation citation1 = (Citation) ois.readObject();
        // 释放资源
        ois.close();

        // 克隆奖状对象，修改具体属性值
        citation1.getStudent().setName("李四");

        // 4. 调用 show 方法展示
        citation.show();
        citation1.show();
    }
}
