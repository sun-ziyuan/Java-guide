package org.ziyuan.brand.itguigu;

/**
 * @author sunziyuan
 * @date 2024/7/18 07:04
 */
public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("vivo手机开始~~");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关机~~");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话~~");
    }
}
