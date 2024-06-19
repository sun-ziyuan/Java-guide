package org.ziyuan.mybufferedstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author szy
 * @description
 * @date 2024/6/19 9:58
 */
public class BufferedStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /**
         * 字符缓冲输出流
         *    构造方法: public BufferedWriter(Writer r);
         *    特有方法: public void newLine();  跨平台的换行
         */

        // 1. 创建字符缓冲输出流的对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
        // 2. 写出数据
        bw.write("你嘴角上扬的样子,百度搜索不到");
        bw.newLine();       // 换行
        bw.write("以后如果我结婚了,你一定要来哦,没有新娘我会很尴尬");

        // 3. 释放资源
        bw.close();

    }
}
