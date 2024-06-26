package org.ziyuan;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 读取多个数据，读到末尾返回-1
 * @author szy
 * @description
 * @date 2024/6/11 15:53
 */
public class CharStreamDemo02 {
    public static void main(String[] args) throws IOException {
        // 1. 创建字符输入流
        FileReader fileReader = new FileReader("C:\\Users\\sunzi\\Desktop\\Java-guide\\JavaSE\\javase\\javase-io\\src\\main\\resources\\a.txt");
        // 2.读取数据
        char[] chars = new char[2];
        int read;
        while ((read = fileReader.read(chars)) != -1){
            // 把数组中的数据变成字符串再进行打印
            System.out.print( new String(chars,0,read));
        }

        // 3.自动释放资源
        fileReader.close();
    }
}
