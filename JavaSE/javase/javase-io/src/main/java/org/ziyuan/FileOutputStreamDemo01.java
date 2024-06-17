package org.ziyuan;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author szy
 * @description
 * @date 2024/6/17 10:31
 */
public class FileOutputStreamDemo01 {
    /*
     * 1. 创建对象
     * 2. 写出数据
     * 3. 关闭流
     * 输出: abcdef
     * */
    @Test
    public void test() throws IOException {
        // 1.1 创建对象,通过绝对路径: 文件存在/不存在: 存在会清空文件数据,不存在自动创建文件,必须保证父类文件地址存在
        FileOutputStream fos = new FileOutputStream("C:\\Users\\sunzi\\Desktop\\Java-guide\\JavaSE\\javase\\javase-io\\src\\main\\resources\\a.txt");
        // 1.2 创建对象,开启续写:  默认 false 表示清空文件,直接覆盖. true 不会清空文件, 直接续写.
        FileOutputStream fos1 = new FileOutputStream("src\\main\\resources\\a.txt",true);

        // 写出数据
        fos.write(97); // 写出第1个字节
        fos.write(98); // 写出第2个字节
        fos.write(99); // 写出第3个字节

        fos1.write(100); // 写出第4个字节
        fos1.write(101); // 写出第5个字节
        fos1.write(102); // 写出第6个字节

        // 3. 关闭流
        fos.close();
        fos1.close();
    }

    /**
     * 1. 创建对象
     * 2. 写出数据
     * 3. 关闭流
     * 输出: 我是一只小小小小鸟
     */
    @Test
    public void test2() throws IOException {
        // 1. 创建对象
        FileOutputStream fos = new FileOutputStream("src\\main\\resources\\a.txt");
        // 2. 写出数据: 字符串转换为字节数组
        byte[] bytes = "我是一只小小小小鸟".getBytes();
        fos.write(bytes);
        // 3. 关闭流
        fos.close();
    }

    /**
     * 1. 创建对象
     * 2. 写出数据
     * 3. 关闭流
     * 输出: cd
     */
    @Test
    public void test3() throws IOException {
        // 1. 创建对象
        FileOutputStream fos = new FileOutputStream("src\\main\\resources\\a.txt");
        // 2. 写出数据:字符串转换为字节数组
        byte[] bytes = "abcde".getBytes();
        // 写出从索引2开始,2个字节
        fos.write(bytes,2,2);
        // 3. 关闭资源
        fos.close();
    }

    @Test
    public void test4() throws IOException {
        // 1. 创建对象
        FileOutputStream fos = new FileOutputStream("src\\main\\resources\\a.txt");

        // 2. 写出数据 换行: Java底层做啦补全 \n\r都可以; windows:\r\n; Linux:\n; Mac:\r;
        byte[] bytes2 = "\r\n".getBytes();
        fos.write(bytes2);
        fos.write("换行啦".getBytes());

        // 3. 关闭流
        fos.close();
    }

}
