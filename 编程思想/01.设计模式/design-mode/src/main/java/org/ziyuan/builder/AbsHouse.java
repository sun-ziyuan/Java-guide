package org.ziyuan.builder;

public abstract class AbsHouse {
    // 打地基
    protected abstract void piling();
    // 砌墙
    protected abstract void walling();
    // 封顶
    protected abstract void capping();
    // 构建
    public void build() {
        piling();
        walling();
        capping();
    }
}
