package org.ziyuan.adapter.itguigu.classadapter;

/**
 * 适配者类: 原本是220伏,所以需要继承,
 *      需要适配(目标)5伏,需要实现
 * @author sunziyuan
 * @date 2024/7/10 22:29
 */
public class VoltageAdapter extends Voltage220 implements IVoltage5V{
    @Override
    public Integer output5V() {
        // 获取到220v电压
        Integer source = output220V();
        // 转换成5v
        int target = source / 44;
        System.out.println("电压="+target+"伏");
        return target;
    }
}
