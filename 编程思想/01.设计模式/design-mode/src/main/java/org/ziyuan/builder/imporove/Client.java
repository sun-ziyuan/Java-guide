package org.ziyuan.builder.imporove;

/**
 * @author szy
 * @description
 * @date 2024/6/26 14:52
 */
public class Client {
    public static void main(String[] args) {
        // 建造者
        HouseDirector houseDirector = new HouseDirector();
        House house;


        // 盖普通房子
        houseDirector.setHouseBuilder(new NormalRoomBuilder());
        // 开始建造
        house = houseDirector.buildHouse();

        // 盖高楼
        houseDirector.setHouseBuilder(new HighRiseBuilder());
        // 重置建造者
        house = houseDirector.buildHouse();

        // 盖别墅
        houseDirector.setHouseBuilder(new VillaBuilder());
        // 重置建造者
        house = houseDirector.buildHouse();

    }
}
