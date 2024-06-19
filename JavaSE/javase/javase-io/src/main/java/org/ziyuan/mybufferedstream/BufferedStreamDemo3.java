package org.ziyuan.mybufferedstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author szy
 * @description
 * @date 2024/6/19 9:58
 */
public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        /**
         * 字符缓冲输入流:
         *    构造方法: public BufferedReader(Reader r);
         *    特有方法: public String readLine(); 读一整行
         *
         */

        // 1. 创建字符缓冲输入流的对象
        BufferedReader br = new BufferedReader(new FileReader("javase-io\\src\\main\\resources\\a.txt"));
        // 2. 读取数据
        String s;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }

        // 3. 释放资源
        br.close();
    }
}
