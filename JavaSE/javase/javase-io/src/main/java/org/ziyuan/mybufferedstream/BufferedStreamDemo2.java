package org.ziyuan.mybufferedstream;

import java.io.*;

/**
 * @author szy
 * @description
 * @date 2024/6/19 9:14
 */
public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /**
         * 需求: 利用字符缓冲流拷贝文件
         * 字节缓冲输入流的构造方法: public BufferedInputStream(InputStream is);
         * 字节缓冲输出流的构造方法: public BufferedOutputStream(OutputStream os);
         */

        // 1. 创建缓冲流的对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("javase-io\\fw.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("javase-io\\b.txt"));
        // 2. 拷贝
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }


        // 3. 释放资源
        bos.close();
        bis.close();
    }
}
