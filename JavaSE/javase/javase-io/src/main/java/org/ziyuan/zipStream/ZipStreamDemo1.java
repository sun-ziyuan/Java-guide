package org.ziyuan.zipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author szy
 * @description
 * @date 2024/6/24 9:20
 */
public class ZipStreamDemo1 {

    public static void main(String[] args) throws IOException {
        // 1. 创建一个File表示要解压的压缩包
        File src = new File("D:\\a.zip");
        // 2. 创建一个File表示解压的目的地
        File dest = new File("D:\\");
        // 3. 调用方法
        unzip(src,dest);
    }

    // 解压的本质: 把压缩包里面的每一个条件或者文件夹读取出来,按照层级拷贝到目的地中
    public static void unzip(File src,File dest) throws IOException {
        // 1. 创建解压缩流用来读取压缩包中的数据
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        // 2. 循环获取压缩包中的每一个文件或者文件夹
        ZipEntry entry;
        while ((entry=zip.getNextEntry()) != null){
            System.out.println(entry);
            // 2.1 文件夹: 如果是文件夹,则创建文件夹
            if (entry.isDirectory()){
                File dir = new File(dest,entry.toString());
                dir.mkdirs();
            }else {
            // 2.2 文件: 如果是文件,则创建文件,并把压缩包中的内容写入到文件中
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while ((b=zip.read()) != -1){
                    // 写到项目中
                    fos.write(b);
                }
                // 表示在压缩包中的一个文件处理完成
                fos.close();
                zip.closeEntry();

            }
        }
        // 3. 释放资源
        zip.close();
    }
}
