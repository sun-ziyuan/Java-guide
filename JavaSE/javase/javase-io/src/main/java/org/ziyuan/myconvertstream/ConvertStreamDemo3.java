package org.ziyuan.myconvertstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * @author szy
 * @description
 * @date 2024/6/20 9:58
 */
public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        // 利用转换流按照指定字符编码写出
        // 1.创建转换流的对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("javase-io\\gbkfile.txt"),"GBK");
        // 2.写出数据
        osw.write("你好你好啊");
        // 关闭流
        osw.close();
    }
}
