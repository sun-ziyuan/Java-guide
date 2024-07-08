package org.ziyuan.adapter.itguigu.classadapter;

/**
 * 使用适配器方法
 * @author sunziyuan
 * @date 2024/7/9 06:27
 */
public class Phone {
    // 充电的方法
    public void charing(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("电压=5伏，正常充电~~");
        }else{
            System.out.println("电压!=5伏，无法充电~~");
        }
    }
}
