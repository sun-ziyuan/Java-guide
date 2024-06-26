package org.ziyuan.builder.imporove;

/**
 * @author szy
 * @description 抽象的建造者
 * @date 2024/6/26 14:33
 */
public abstract class HouseBuilder {
    protected House house = new House();

    // 将建造的流程写好, 抽象的方法
    public abstract void buildBasic();  // 打地基
    public abstract void buildWalls();  // 砌墙
    public abstract void roofed();      // 屋顶

    // 建造房子好, 将产品(房子) 返回
    public House buildHouse(){
        return house;
    }
}
