package org.ziyuan.myconvertstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author szy
 * @description
 * @date 2024/6/20 15:22
 */
public class ConvertStreamDemo5 {
    public static void main(String[] args) throws IOException {
        // 将GBK编码的文本文件，转换为UTF-8编码的文本文件。
        FileReader fr = new FileReader("javase-io\\gbkfile.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("javase-io\\uftfile.txt", StandardCharsets.UTF_8);

        // 读取并写出
        char[] bytes = new char[1024];
        int c;
        while ((c = fr.read(bytes)) != -1){
            fw.write(bytes,0,c);
        }

        // 关闭流
        fw.close();
        fr.close();

    }
}
