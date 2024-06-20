package org.ziyuan.myconvertstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author szy
 * @description
 * @date 2024/6/20 9:58
 */
public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 1. 创建对象并指定字符编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream("javase-io\\gbkfile.txt"),"GBK");
        // 2. 读取数据
        int ch;
        while ((ch = isr.read()) != -1){
            System.out.print((char)ch);
        }
        // 3. 关闭流
        isr.close();

    }
}
