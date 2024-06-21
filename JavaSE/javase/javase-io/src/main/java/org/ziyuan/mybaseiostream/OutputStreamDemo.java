package org.ziyuan.mybaseiostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author szy
 * @description
 * @date 2024/6/21 15:46
 */
public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        // 1.创建对象,通过相对路径
        OutputStream fos = new FileOutputStream("a.txt");

        // 2.写出数据: 使用ASCII
        fos.write(97); // 输出 a

        // 2.写出数据: 字节数组(ASCII字符集)
        fos.write("abcdefghijk".getBytes());     // 输出 bcd

        // 2.写出数据: 数组, 起始索引0, 个数
        fos.write("abcdefghijk".getBytes(),1,2); // 输出 bc

        // 3. 释放资源,每次使用完流之后都要释放资源
        fos.close();
    }
}
