package org.ziyuan.adapter.news.class_adapter;

public class Voltage220V {
    // 输出220伏功率
    public Integer output220V(){
        int source = 220;
        System.out.println("输出电压="+source+"伏");
        return source;
    }
}