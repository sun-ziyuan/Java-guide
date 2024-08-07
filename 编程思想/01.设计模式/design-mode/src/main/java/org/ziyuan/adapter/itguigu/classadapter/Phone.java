package org.ziyuan.adapter.itguigu.classadapter;

/**
 * 手机类(使用类)
 * @author sunziyuan
 * @date 2024/7/10 22:32
 */
public class Phone {
    // 充电方法
    public void charge(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("电压==5伏,正常充电~~~");
        }else {
            System.out.println("电压!=5伏,无法充电~~~");
        }
    }
}
