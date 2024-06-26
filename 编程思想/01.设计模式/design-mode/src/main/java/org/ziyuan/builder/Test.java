package org.ziyuan.builder;

/**
 * @author szy
 * @description 
 * @date 2024/6/26 10:54
 */
public class Test {
    public static void main(String[] args) {
        // 普通房
        NormalRoom normalRoom = new NormalRoom();
        normalRoom.build();

        // 高楼
        HighRise highRise = new HighRise();
        highRise.build();

        // 别墅
        Villa villa = new Villa();
        villa.build();

    }
}
