package org.ziyuan;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author szy
 * @description
 * @date 2024/6/21 10:21
 */
public class Test6Case1 {
    public static void main(String[] args) throws IOException {
        // 1.创建字符缓冲流
        BufferedReader br = new BufferedReader(new FileReader("javase-io\\csb.txt"));
        // 2.读取数据
        String s;
        List<String> list = new ArrayList<>();
        while ((s = br.readLine()) != null) {
            list.add(s);
        }
        // 3.关闭资源
        br.close();

        // 4.排序
        Collections.sort(list,(o1,o2)->{
            int i1 = Integer.parseInt(o1.split("\\.")[0]);
            int i2 = Integer.parseInt(o2.split("\\.")[0]);
            return i1-i2;
        });
        // 5. 写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("javase-io\\csb1.txt"));

        for (String string : list) {
            bw.write(string);
            bw.newLine();
        }
        bw.close();

    }
}
