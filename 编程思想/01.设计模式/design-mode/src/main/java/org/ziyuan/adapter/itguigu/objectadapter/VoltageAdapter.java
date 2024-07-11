package org.ziyuan.adapter.itguigu.objectadapter;

/**
 * 适配器类 Adapter
 * @author sunziyuan
 * @date 2024/7/10 23:01
 */
public class VoltageAdapter implements IVoltage5V{

    // 220伏电压
    private Voltage220 voltage220;

    // 通过构造器注入220伏进来
    public VoltageAdapter(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    // 输出5伏电压
    @Override
    public Integer output5V() {
        // 判断是否使用220v电压
        if (voltage220 == null) {
            return 0;
        }
        // 获取220伏电压
        int source = voltage220.output220V();
        // 转换为5伏
        int target = source / 44;
        System.out.println("电压=" + target + "伏");
        return target;
    }
}
