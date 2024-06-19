package org.ziyuan;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author sunziyuan
 * @date 2024/6/18 06:26
 */
public class CharStreamDemo05 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/mac/Desktop/Java-guide/JavaSE/javase/javase-io/src/main/resources/a.txt");

        // 1. 缓冲区满啦 自动刷新到本地文件
        for (int i = 0; i < 8193; i++) {
            fw.write(97);
        }


        // 2. 调用flush()方法
        fw.write("兄弟你瘦啦");
        fw.write("看着疲惫啦");
        fw.flush();
        fw.write("一路红尘盖不住 岁月的脸颊");
        fw.write("兄弟你变了 变的沉默了");
        fw.write("说说吧那些放到心里的话");

        // 3. 调用close()方法
        fw.close();

    }
}
