package org.ziyuan.adapter.news.object_adapter;

// 适配器类（Adapter）：原本是220伏,所以需要继承,转换5伏则需要适配(目标)5伏,需要实现
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public Integer output5V() {
        // 获取到220v电压
        Integer source = output220V();
        // 转换成5v
        int target = source / 44;
        System.out.println("转换电压="+target+"伏");
        return target;
    }
}