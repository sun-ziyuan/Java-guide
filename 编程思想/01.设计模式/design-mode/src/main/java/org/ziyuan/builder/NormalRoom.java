package org.ziyuan.builder;

/**
 * @author szy
 * @description
 * @date 2024/6/26 10:54
 */
public class NormalRoom extends AbsHouse{
    @Override
    protected void piling() {
        System.out.println("普通房打桩...");
    }

    @Override
    protected void walling() {
        System.out.println("普通房砌墙...");
    }

    @Override
    protected void capping() {
        System.out.println("普通房封顶...");
    }
}
