package org.ziyuan.adapter.itguigu.classadapter;

/**
 * 被适配器类
 * @author sunziyuan
 * @date 2024/7/10 22:24
 */
public class Voltage220 {
    // 输出220伏功率
    public Integer output220V(){
        int source = 220;
        System.out.println("电压="+source+"伏");
        return source;
    }
}
