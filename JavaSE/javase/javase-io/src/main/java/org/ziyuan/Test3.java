package org.ziyuan;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author szy
 * @description
 * @date 2024/6/18 16:49
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        /*
            文本文件中有以下的数据：
                2-1-9-4-7-8
            将文件中的数据进行排序，变成以下的数据：
                1-2-4-7-8-9
        */
        // 1. 读取数据
        FileReader fr = new FileReader("javase-io\\src\\main\\resources\\a.txt");
        StringBuilder sb = new StringBuilder();
        int read;
        while ((read = fr.read())!=-1){
            sb.append((char) read);
        }

        // 2. 替换数据
        Integer[] array = Arrays.asList(sb.toString().split("-")).stream()
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

        // 3. 写出去
        FileWriter fw = new FileWriter("javase-io\\src\\main\\resources\\a.txt");
        String replace = Arrays.toString(array).replace(", ", "-");
        fw.write(replace.substring(1, replace.length() - 1));

        fw.close();
        fr.close();
    }
}
