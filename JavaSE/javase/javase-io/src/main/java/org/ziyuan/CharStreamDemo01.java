package org.ziyuan;

import java.io.FileReader;

/**
 * @author szy
 * @description
 * @date 2024/6/11 14:46
 */
public class CharStreamDemo01 {
    public static void main(String[] args) {
        /*
         * 1. 创建字符输入流对象
         * public FileReader(File file);            创建字符输入流对象
         * public FileReader(String pathname);      创建字符输入流对象
         *
         * 2. 读取数据
         * public int read();                       读取数据,读到末尾返回-1
         * public int read(char[] buffer)           读取多个数据,读到末尾返回-1
         *
         * 3. 释放资源
         * public void close();
         */
        try(
            // 1. 创建对象并关联本地文件
            FileReader fileReader = new FileReader("C:\\Users\\sunzi\\Desktop\\Java-guide\\JavaSE\\javase\\javase-io\\src\\main\\resources\\a.txt")){
            // 2. 读取数据 read(),
            // 字符流的底层也是字节流,默认也是一个字节一个字节的读取的.遇到中文,就会一次读多个字节,GBK一次读两个字节,UTF-8一次读三个字节
            // 在读取之后,方法的底层还会进行解码并转成十进制.最终把这个十进制作为返回值(十进制表示字符集上的数字)
            //  英文: 文件里面二进制数据 0110 0001
            //      read方法进行读取,解码并转为十进制 97
            //  中文: 文件里面二进制数据 11100110 10110001 10001001
            //      read方法进行读取,解码并转为十进制 27721
            int read;
            while ((read  = fileReader.read()) != -1){
                char read1 = (char) read;
                System.out.print(read1);
            }
            // 3. 自动释放资源
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
