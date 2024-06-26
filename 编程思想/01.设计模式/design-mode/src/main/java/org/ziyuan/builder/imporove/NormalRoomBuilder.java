package org.ziyuan.builder.imporove;

/**
 * @author szy
 * @description 普通房子
 * @date 2024/6/26 14:38
 */
public class NormalRoomBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶");
    }
}
