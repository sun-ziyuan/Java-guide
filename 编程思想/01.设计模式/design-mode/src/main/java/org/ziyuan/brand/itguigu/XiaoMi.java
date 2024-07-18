package org.ziyuan.brand.itguigu;

/**
 * @author sunziyuan
 * @date 2024/7/18 07:04
 */
public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("小米手机开机~~");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机~~");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话~~");
    }
}
