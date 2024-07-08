package org.ziyuan.adapter.itguigu.classadapter;

/**
 * 适配器：
 * @author sunziyuan
 * @date 2024/7/9 06:24
 */
public class VoltageAdapter extends Voltage220 implements IVoltage5V{
    @Override
    public Integer output5V() {
        // 获取到220V电压
        int src = output220V();
        // 转成5V
        int dst = src / 44;
        System.out.println("电压="+dst+"伏");
        return dst;
    }
}
