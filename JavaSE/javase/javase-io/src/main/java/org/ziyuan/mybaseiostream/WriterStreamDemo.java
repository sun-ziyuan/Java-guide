package org.ziyuan.mybaseiostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author szy
 * @description
 * @date 2024/6/21 16:07
 */
public class WriterStreamDemo {
    public static void main(String[] args) throws IOException {
        // 1. 创建字符输出流对象
        Writer fw = new FileWriter("fw.txt");

        // 2. 写数据 写出整数
        fw.write(97);
        fw.write("\r\n");
        // 2. 写数据 写出字符串、部分字符串
        fw.write("字符串");
        fw.write("字符串",1,2);
        fw.write("\r\n");

        // 2. 写数据 写出字符数组、部分数组
        char[] chars = "今天是个好日子".toCharArray(); // 字符串转换为字节数组
        System.out.println(chars);
        fw.write(chars);                            // 写出字符数组
        fw.write(chars,2,2);               // 写出从索引2开始,2个字节


        // 关闭资源,如果不关闭,数据只是保存到缓冲区，并未保存到文件
        fw.close();
    }
}
