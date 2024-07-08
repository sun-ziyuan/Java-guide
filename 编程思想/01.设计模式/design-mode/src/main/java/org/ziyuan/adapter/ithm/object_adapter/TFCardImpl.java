package org.ziyuan.adapter.ithm.object_adapter;

/**
 * @author sunziyuan
 * @date 2024/7/6 17:49
 */
public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        return "tf card read msg: hello word tf card";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("tf card write msg:"+msg);
    }
}
