package org.ziyuan.builder.imporove;

/**
 * @author szy
 * @description 别墅
 * @date 2024/6/26 15:47
 */
public class VillaBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("别墅打桩...");
    }

    @Override
    public void buildWalls() {
        System.out.println("别墅砌墙...");
    }

    @Override
    public void roofed() {
        System.out.println("别墅封顶...");
    }
}
