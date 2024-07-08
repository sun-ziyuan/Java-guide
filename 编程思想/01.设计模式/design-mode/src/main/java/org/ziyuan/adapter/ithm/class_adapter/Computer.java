package org.ziyuan.adapter.ithm.class_adapter;

/**
 * 电脑类
 * @author sunziyuan
 * @date 2024/7/6 12:53
 */
public class Computer {
    public String readSD(SDCard sdCard){
        if(sdCard == null){
            throw new NullPointerException("sd card null");
        }
        return sdCard.readSD();
    }
}
