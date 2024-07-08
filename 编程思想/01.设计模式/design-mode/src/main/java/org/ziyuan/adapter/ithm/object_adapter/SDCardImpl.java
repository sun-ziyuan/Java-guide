package org.ziyuan.adapter.ithm.object_adapter;

/**
 * @author sunziyuan
 * @date 2024/7/6 17:41
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "sd card read a msg: hello word SD";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("sd card write a msg:" + msg);
    }

}
