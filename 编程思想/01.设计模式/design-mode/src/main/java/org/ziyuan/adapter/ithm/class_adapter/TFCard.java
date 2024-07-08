package org.ziyuan.adapter.ithm.class_adapter;

/**
 * TF卡接口
 * @author sunziyuan
 * @date 2024/7/6 12:55
 */
public interface TFCard {
    // 读取TF卡方法
    String readTF();
    // 写入TF卡功能
    void writeTF(String msg);
}
