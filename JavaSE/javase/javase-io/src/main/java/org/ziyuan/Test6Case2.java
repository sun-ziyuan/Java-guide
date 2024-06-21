package org.ziyuan;

import java.io.*;
import java.util.*;

/**
 * @author szy
 * @description
 * @date 2024/6/21 10:21
 */
public class Test6Case2 {
    public static void main(String[] args) throws IOException {
        // 1.创建字符缓冲流
        BufferedReader br = new BufferedReader(new FileReader("javase-io\\csb.txt"));
        // 2.读取数据
        TreeMap<Integer,String> treeSet = new TreeMap<>();
        String s;
        while ((s = br.readLine()) != null){
            String[] split = s.split("\\.");
            treeSet.put(Integer.parseInt(split[0]),s);
        }
        // 3.释放资源
        br.close();
        // 4.写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("javase-io\\csb1.txt"));
        for (Map.Entry<Integer, String> entry : treeSet.entrySet()) {
            bw.write(entry.getValue());
            bw.newLine();
        }
        bw.close();
    }
}
