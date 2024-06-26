package org.ziyuan.builder.imporove;

/**
 * @author szy
 * @description 高楼
 * @date 2024/6/26 14:41
 */
public class HighRiseBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("高楼的打地基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼的砌墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼的透明屋顶");
    }
}
