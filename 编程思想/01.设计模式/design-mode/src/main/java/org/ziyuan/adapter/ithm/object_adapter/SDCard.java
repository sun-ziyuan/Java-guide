package org.ziyuan.adapter.ithm.object_adapter;

/**
 * SD卡接口
 * @author sunziyuan
 * @date 2024/7/6 17:38
 */
public interface SDCard {
    // 读取SD卡方法
    String readSD();

    // 写入SD卡功能
    void writeSD(String msg);
}
