package org.ziyuan.adapter.itguigu.objectadapter;

/**
 * @author sunziyuan
 * @date 2024/7/10 23:05
 */
public class Phone {
    // 充电方法
    public void charge(IVoltage5V voltage5V){
        if(voltage5V.output5V() == 5){
            System.out.println("电压==5伏,正常充电~~~");
        }else{
            System.out.println("电压!=5伏,无法充电~~~");
        }
    }
}
