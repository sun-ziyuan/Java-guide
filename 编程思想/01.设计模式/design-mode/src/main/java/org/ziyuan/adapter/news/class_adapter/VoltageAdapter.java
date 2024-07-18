package org.ziyuan.adapter.news.class_adapter;

// 适配器类（Adapter）：原本是220伏,所以需要继承,转换5伏则需要适配(目标)5伏,需要实现
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public Integer output5V() {
        // 判断是否使用220v电压
        if (voltage220V == null) {
            return 0;
        }
        // 获取220伏电压
        int source = voltage220V.output220V();
        // 转换成5v
        int target = source / 44;
        System.out.println("转换电压="+target+"伏");
        return target;
    }
}