package org.ziyuan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author szy
 * @description
 * @date 2024/6/18 15:32
 */
public class Test2 {
    /*
         为了保证文件的安全性，就需要对原始文件进行加密存储，再使用的时候再对其进行解密处理。
         加密原理：
             对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中。
         解密原理：
             读取加密之后的文件，按照加密的规则反向操作，变成原始文件。

          ^ : 异或  两边相同: 0(false),两边不同: 1(true)
          100 ^ 10 = 1100100 ^ 0001010 = 1101110（110）
          110 ^ 10 = 1101110 ^ 0001010 = 1100100（100）
     */
    public static void main(String[] args) throws IOException {
        // 1. 读取数据
        // 加密
        // FileInputStream fis = new FileInputStream("javase-io\\src\\main\\resources\\1718696181849.jpg");
        // FileOutputStream fos = new FileOutputStream("javase-io\\src\\main\\resources\\jiami.jpg");
        // 解密
        FileInputStream fis = new FileInputStream("javase-io\\src\\main\\resources\\jiami.jpg");
        FileOutputStream fos = new FileOutputStream("javase-io\\src\\main\\resources\\jiami1.jpg");
        int len;
        while ((len = fis.read()) != -1) {
            // 2. 写出数据
            fos.write(len ^ 2);
        }

        // 3. 关闭流
        fos.close();
        fis.close();
    }
}
