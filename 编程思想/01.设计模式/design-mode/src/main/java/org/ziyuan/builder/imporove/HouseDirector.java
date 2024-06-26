package org.ziyuan.builder.imporove;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author szy
 * @description 指挥者: 这里去指定制作流程,返回产品
 * @date 2024/6/26 14:45
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    public HouseDirector() {
    }

    // 构造器传入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 通过 setter 传入 houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 如何处理建造房子的流程,交给指挥者
    public House buildHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }

}
