package org.ziyuan.mybaseiostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author szy
 * @description
 * @date 2024/6/21 16:42
 */
public class ReaderStreamDemo {
    public static void main(String[] args) throws IOException {
        // 1. 创建字符输入流
        Reader reader = new FileReader("fw.txt");

        // 2. 读取数据 read()
//        int read;
//        while ((read  = reader.read()) != -1){
//            char read1 = (char) read;
//            System.out.print(read1);
//        }

        // 2.读取数据
        char[] chars = new char[2];
        int read;
        while ((read = reader.read(chars)) != -1){
            // 把数组中的数据变成字符串再进行打印
            System.out.print(new String(chars,0,read));
        }

        // 3. 释放资源
        reader.close();
    }
}
