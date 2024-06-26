package org.ziyuan.builder;

/**
 * @author szy
 * @description 
 * @date 2024/6/26 10:53
 */
public class HighRise extends AbsHouse {
    @Override
    protected void piling() {
        System.out.println("高楼打桩...");
    }

    @Override
    protected void walling() {
        System.out.println("高楼砌墙...");
    }

    @Override
    protected void capping() {
        System.out.println("高楼封顶...");
    }
}
