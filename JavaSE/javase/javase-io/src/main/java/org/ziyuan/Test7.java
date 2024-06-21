package org.ziyuan;

import java.io.*;

/**
 * @author szy
 * @description
 * @date 2024/6/21 11:01
 */
public class Test7 {

    public static void main(String[] args) throws IOException {
        /**
         * 实现一个验证程序运行次数的小程序，要求如下：
         * 1. 当程序运行超过3次时给出提示：本软件只能免费使用3次，欢迎您注册会员后继续使用~~
         * 2. 程序运行演示如下：第一次运行控制台输出：欢迎使用本软件，第1次使用免费~~
         *    第二次运行控制台输出：欢迎使用本软件，第2次使用免费~~
         *    第三次运行控制台输出：欢迎使用本软件，第3次使用免费~~
         *    第四次及之后运行控制台输出：本软件只能免费使用3次，欢迎您注册会员后继续使用~~
         */

        // 读取count.txt
        BufferedReader br = new BufferedReader(new FileReader("javase-io\\count.txt"));
        String s = br.readLine();
        int count = Integer.parseInt(s);
        if(count<3){
            count++;
            BufferedWriter bw = new BufferedWriter(new FileWriter("javase-io\\count.txt"));
            // 写出去
            bw.write(count+"");
            bw.close();
            System.out.println("欢迎使用本软件，第"+count+"次使用免费~~");
        }else{
            System.out.println("本软件只能免费使用3次，欢迎您注册会员后继续使用~~");
        }

        br.close();
    }
}
