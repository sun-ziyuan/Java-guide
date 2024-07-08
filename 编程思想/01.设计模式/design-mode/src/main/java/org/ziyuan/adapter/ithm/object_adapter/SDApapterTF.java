package org.ziyuan.adapter.ithm.object_adapter;

/**
 * @author sunziyuan
 * @date 2024/7/6 17:50
 */
public class SDApapterTF implements SDCard{
    private TFCard tfCard;
    public SDApapterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.readTF();
    }
}
