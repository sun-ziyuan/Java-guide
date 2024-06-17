package org.ziyuan;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author szy
 * @description
 * @date 2024/6/17 11:44
 */
public class FileInputStreamDemo01 {

    @Test
    public void test() throws IOException {
        // 1. 创建读对象流
        FileInputStream fis = new FileInputStream("src\\main\\resources\\a.txt");

        // 2. 读取数据,返回一个字节
        int read;
        while ((read = fis.read()) != -1){
            System.out.print((char) read);		// 输出: ab
        }

        // 3. 关闭流
        fis.close();
    }


    @Test
    public void test2() throws IOException {
        // 1. 创建读对象流
        FileInputStream fis = new FileInputStream("src\\main\\resources\\a.txt");

        // 2. 读取数据,返回一个字节
        byte[] b = new byte[20];
        // 循环读取
        int len;
        while ((len = fis.read(b)) != -1){
            // 每次读取后,把数组的有效字节部分，变成字符串打印
            System.out.println(new String(b,0,len));
        }

        // 3. 关闭流
        fis.close();
    }

    @Test
    public void test3() throws IOException {
        // 1. 创建输入输出流
        FileInputStream fis = new FileInputStream("src\\main\\resources\\a.txt");
        FileOutputStream fos = new FileOutputStream("src\\main\\resources\\a1.txt");

        // 2. 读取文件进行写出
        byte[] bytes = new byte[1024 * 1024 * 5];
        int len;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }

    }
}
