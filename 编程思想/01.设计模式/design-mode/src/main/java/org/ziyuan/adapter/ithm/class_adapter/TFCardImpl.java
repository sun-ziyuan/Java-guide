package org.ziyuan.adapter.ithm.class_adapter;

/**
 * TF实现类
 * @author sunziyuan
 * @date 2024/7/6 12:56
 */
public class TFCardImpl implements TFCard{

    @Override
    public String readTF() {
        String msg = "tf card read msg: hello word tf card";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("tf card write msg:"+ msg);
    }
}
