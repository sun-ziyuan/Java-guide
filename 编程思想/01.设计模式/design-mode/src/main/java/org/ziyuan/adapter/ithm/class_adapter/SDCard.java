package org.ziyuan.adapter.ithm.class_adapter;

/**
 * SD卡的接口
 * @author sunziyuan
 * @date 2024/7/6 12:49
 */
public interface SDCard {
    // 读取SD卡方法
    String readSD();
    // 写入SD卡功能
    void writeSD(String msg);
}
