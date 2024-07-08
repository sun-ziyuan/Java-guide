package org.ziyuan.adapter.itguigu.classadapter;

/**
 * 被适配的类
 * @author sunziyuan
 * @date 2024/7/9 06:21
 */
public class Voltage220 {
    public Integer output220V(){
        int src = 220;
        System.out.println("电压="+src+"伏");
        return src;
    }
}
