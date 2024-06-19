package org.ziyuan.myprintstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 * @author szy
 * @description
 * @date 2024/6/19 17:16
 */
public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        /**
         * 1.字节打印流:
         *  构造方法:
         *      public PrintStream(OutputStream/File/String)            关联字节输出流/文件/文件路径
         *      public PrintStream(String fileName, Charset charset)    指定字符编码
         *      public PrintStream(OutputStream out,boolean autoFlush)  自动刷新
         *      public PrintStream(OutputStream out,boolean autoFlush,String encoding)  指定字符编码且自动刷新
         *  成员方法:
         *      public void write(int b)            常规方法：规则跟之前一样，讲指定的字节写出
         *      public void println(Xxx xx)         特有方法：打印任意数据，自动刷新，自动换行
         *      public void print(Xxx xx)           特有方法：打印任意数据，不换行
         *      public void printf(String format, Object... args)   特有方法：带有占位符的打印语句，不换号
         */
        // 1. 创建字节打印流对象  Charset.forName("UTF-8")
        PrintStream ps = new PrintStream(new FileOutputStream("javase-io\\a.txt"),true,"UTF-8");
        // 2. 写出数据
        ps.println(97); // 写出 + 自动刷新 + 自动换行
        ps.println(true);
        ps.printf("%s爱上了%s","阿珍","阿强");
        // 3. 关闭流
        ps.close();
    }
}
