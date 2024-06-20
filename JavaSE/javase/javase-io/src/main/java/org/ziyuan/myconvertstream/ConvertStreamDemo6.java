package org.ziyuan.myconvertstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author szy
 * @description
 * @date 2024/6/20 15:42
 */
public class ConvertStreamDemo6 {
    public static void main(String[] args) throws IOException {
        // 利用字节流读取文件中的数据,每次读一整行,而且不能出现乱码
        BufferedReader br = new BufferedReader(new FileReader("javase-io\\gbkfile.txt", Charset.forName("GBK")));
        String s;
        while ((s=br.readLine())!=null){
            System.out.println(s);
        }

        // 关闭流
        br.close();

    }
}
