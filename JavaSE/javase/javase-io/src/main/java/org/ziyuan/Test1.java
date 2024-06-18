package org.ziyuan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author szy
 * @description
 * @date 2024/6/18 14:02
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        //拷贝一个文件夹，考虑子文件夹

        //1.创建对象表示数据源
        File src = new File("D:\\io\\src");
        //2.创建对象表示目的地
        File dest = new File("D:\\io\\dest");
        //3.调用方法开始拷贝
        copydir(src,dest);
    }

    /**
     * 作用: 拷贝文件夹
     * @param src  数据源
     * @param dest 目的地
     */
    private static void copydir(File src, File dest) throws IOException {
        dest.mkdirs();
        // 递归
        // 1. 进入数据源
        File[] files = src.listFiles();
        // 2. 遍历数组
        for (File file : files) {
            if(file.isFile()){
                // 3. 判断文件,拷贝
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));

                byte[] bytes = new byte[1024];
                int len;
                while ((len=fis.read(bytes)) != -1){
                    fos.write(bytes,0,len);
                }

                // 关闭流
                fos.close();
                fis.close();
            }else{
                // 4. 判断文件夹,递归
                copydir(file,new File(dest,file.getName()));
            }
        }
    }
}
