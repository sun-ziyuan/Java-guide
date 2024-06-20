package org.ziyuan.myconvertstream;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author szy
 * @description
 * @date 2024/6/20 9:58
 */
public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 1.创建对象指定字符编码
        FileReader fr = new FileReader("javase-io\\gbkfile.txt", Charset.forName("GBK"));

        // 2. 读取数据
        int len;
        while ((len = fr.read()) != -1) {
            System.out.print((char) len);
        }

        // 3. 释放资源
        fr.close();

    }
}
