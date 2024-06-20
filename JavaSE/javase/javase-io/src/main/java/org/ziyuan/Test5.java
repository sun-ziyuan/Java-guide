package org.ziyuan;

import java.io.*;

/**
 * @author szy
 * @description
 * @date 2024/6/20 16:50
 */
public class Test5 {

    public static void main(String[] args) throws IOException {
        // 四种方式拷贝文件,并统计各自用时
        long start = System.currentTimeMillis();
        // method1(); -586460
        //method2();
        //method3();
        //method4();
        long end = System.currentTimeMillis();
        System.out.println((end - start)/1000.0 +"秒");


    }

    // 字节流的基本流: 一次读写一个字节 161,382,008 字节
    public static void method1() throws IOException {
        // 1. 创建输入输出流
        FileInputStream fis = new FileInputStream("C:\\Users\\sunzi\\Desktop\\jdk-17.0.11_windows-x64_bin.exe");
        FileOutputStream fos = new FileOutputStream("javase-io\\jdk-17.0.11_windows-x64_bin.exe");

        // 2. 拷贝
        int read;
        while ((read = fis.read()) != -1){
            fos.write(read);
        }

        // 3. 释放资源
        fos.close();
        fis.close();
    }

    // 字节流的基本流：一次读写一个字节数组
    public static void method2() throws IOException {
        // 1.创建输入输出流
        FileInputStream fis = new FileInputStream("C:\\Users\\sunzi\\Desktop\\jdk-17.0.11_windows-x64_bin.exe");
        FileOutputStream fos = new FileOutputStream("javase-io\\jdk-17.0.11_windows-x64_bin.exe");

        // 2.拷贝
        byte[] bytes = new byte[8192];
        int len;
        while ((len=fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }

        // 3.关闭流
        fos.close();
        fis.close();
    }

    // 字节流的缓冲流：一次读写一个字节
    public static void method3() throws IOException {
        // 1. 创建字节缓冲流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\sunzi\\Desktop\\jdk-17.0.11_windows-x64_bin.exe"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("javase-io\\jdk-17.0.11_windows-x64_bin.exe"));

        // 2. 拷贝
        int b;
        while ((b=bis.read()) != -1){
            bos.write(b);
        }

        // 3. 关闭流
        bos.close();
        bis.close();
    }

    // 字节流的缓冲流：一次读写一个字节数组
    public static void method4() throws IOException {
        // 1. 创建字节缓冲流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\sunzi\\Desktop\\jdk-17.0.11_windows-x64_bin.exe"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("javase-io\\jdk-17.0.11_windows-x64_bin.exe"));

        // 2. 拷贝
        byte[] bytes = new byte[8192];
        int len;
        while ((len=bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }

        // 3. 关闭流
        bos.close();
        bis.close();
    }
}
