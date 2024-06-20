package org.ziyuan.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author szy
 * @description
 * @date 2024/6/20 9:58
 */
public class ConvertStreamDemo4 {
    public static void main(String[] args) throws IOException {

        // 1. 创建转换流的对象
        FileWriter fw = new FileWriter("javase-io\\gbkfile.txt", Charset.forName("GBK"));

        // 2. 写出数据
        fw.write("hello，你好啊！");

        // 3. 关闭流
        fw.close();

    }
}
