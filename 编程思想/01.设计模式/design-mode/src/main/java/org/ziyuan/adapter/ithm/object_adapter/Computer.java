package org.ziyuan.adapter.ithm.object_adapter;

/**
 * 电脑类
 * @author sunziyuan
 * @date 2024/7/6 17:43
 */
public class Computer {
    public String readSD(SDCard sdCard){
        if(sdCard == null){
            throw new NullPointerException("sd card null");
        }
        return sdCard.readSD();
    }
}
