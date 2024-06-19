package org.ziyuan;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author sunziyuan
 * @date 2024/6/18 06:26
 */
public class CharStreamDemo04 {
    public static void main(String[] args) throws IOException {
        // 1. 创建字符输入流对象:
        //     底层: 关联文件，并创建缓冲区(长度为8192的字节数组)
        FileReader fr = new FileReader("/Users/mac/Desktop/Java-guide/JavaSE/javase/javase-io/src/main/resources/a.txt");

        // 2. 读取数据
        //     底层: 1.判断缓冲区中是否有数据可以读取
        //          2.缓冲区没有数据: 就从文件中获取数据，装到缓冲区中，每次尽可能装满缓冲区.
        //                          如果文件中也没有数据了，返回-1
        //          3.缓冲区有数据: 就从缓冲区中读取
        //                  空参的read方法：一次读取一个字节，遇到中文一次读取多个字节，把字节解码并转成十进制返回
        //                  有参的read方法：把读取字节，解码，强转三步合并了，强转之后的字符放到数组中
        int b1 = fr.read();
        System.out.println(b1);

        int b2 = fr.read();
        System.out.println(b2);

        int b3 = fr.read();
        System.out.println(b3);
        System.out.println((char)b3);

        int b4 = fr.read();
        System.out.println(b4);

        fr.close();
    }
}
