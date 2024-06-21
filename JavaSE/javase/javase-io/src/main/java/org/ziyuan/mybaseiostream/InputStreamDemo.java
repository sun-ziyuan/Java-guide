package org.ziyuan.mybaseiostream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author szy
 * @description
 * @date 2024/6/21 17:51
 */
public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        // 1. 创建读对象流：文件不存在，直接报异常
        InputStream fis = new FileInputStream("fw.txt");

        // 2. 读取数据,一次读一个字节,读出来的数据是ASCII对应的数字,读到末尾返回-1
        int read;
        while ((read = fis.read()) != -1){
            System.out.print((char) read);		// 输出: 123
        }

        // 2. 读取数据,返回一个字节
        byte[] b = new byte[20];
        // 循环读取
        int len;
        // 是由于最后一次读取时，只读取一个字节`e`，数组中，上次读取的数据没有被完全替换，所以要通过`len`，获取有效的字节
        while ((len = fis.read(b)) != -1){
            // 每次读取后,把数组变成字符串打印
            System.out.println(new String(b,0,len));	// len 每次读取的有效字节个数
        }

        // 3. 关闭流
        fis.close();
    }
}
