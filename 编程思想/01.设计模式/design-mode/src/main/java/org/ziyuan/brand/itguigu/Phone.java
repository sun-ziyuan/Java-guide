package org.ziyuan.brand.itguigu;

/**
 * @author sunziyuan
 * @date 2024/7/18 07:06
 */
public abstract class Phone {
    // 组合品牌
    private Brand brand;

    // 构造器
    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    }

    protected void close(){
        this.brand.close();
    }

    protected void call(){
        this.brand.call();
    }
}
