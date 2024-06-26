package org.ziyuan;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author szy
 * @description
 * @date 2024/6/12 14:39
 */
public class CharStreamDemo03 {

    /**
     * void write(int c)
     * @throws IOException
     */
    @Test
    public void test1() throws IOException {
        // 1. 创建字符输出流对象
        FileWriter fileWriter = new FileWriter("C:\\Users\\sunzi\\Desktop\\Java-guide\\JavaSE\\javase\\javase-io\\src\\main\\resources\\a.txt");
        // 2. 写数据: 根据字符集的编码方式进行编码,把编码之后的和数据写到文件中去
        fileWriter.write(25105);
        // 3. 释放资源
        fileWriter.close();
    }

    /**
     * void write(String str)
     * @throws IOException
     */
    @Test
    public void test2() throws IOException {
        // 1. 创建字符输出流对象
        FileWriter fileWriter = new FileWriter("C:\\Users\\sunzi\\Desktop\\Java-guide\\JavaSE\\javase\\javase-io\\src\\main\\resources\\a.txt");
        // 2. 写数据: 根据字符集的编码方式进行编码,把编码之后的和数据写到文件中去
        fileWriter.write("你好,世界!!");
        // 3. 释放资源
        fileWriter.close();
    }

    @Test
    public void test3() throws IOException {
        // 1. 创建字符输出流对象
        FileWriter fileWriter = new FileWriter("C:\\Users\\sunzi\\Desktop\\Java-guide\\JavaSE\\javase\\javase-io\\src\\main\\resources\\a.txt");
        // 2. 写数据: 根据字符集的编码方式进行编码,把编码之后的和数据写到文件中去
        char[] chars = {'a','b','c','我','爱','你'};
        fileWriter.write(chars);
        // 3. 释放资源
        fileWriter.close();
    }

    @Test
    public void test4() throws IOException {
        // 1. 创建字符输出流对象
        FileWriter fw = new FileWriter("fw.txt");
        // 2. 写数据
        char[] chars = "今天是个好日子".toCharArray(); // 字符串转换为字节数组
        fw.write(chars);                 // 写出字符数组
        fw.write(chars,2,2);    // 写出从索引2开始,2个字节

        // 关闭资源
        fw.close();
    }

    @Test
    public void test5(){

    }
}
