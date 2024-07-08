package org.ziyuan.adapter.ithm.class_adapter;

/**
 * SD卡实现类
 * @author sunziyuan
 * @date 2024/7/6 12:51
 */
public class SDCardImpl implements SDCard{
    // 读取SD卡数据
    @Override
    public String readSD() {
        String msg = "sd card read a msg: hello word SD";
        return msg;
    }
    // 写入SD卡数据
    @Override
    public void writeSD(String msg) {
        System.out.println("sd card write msg:"+msg);
    }
}
