package org.ziyuan.builder.news;

import lombok.Builder;

/**
 * 三明治类
 */
public class Sandwich{
    // 尺寸
    private int size;
    // 奶酪
    private boolean cheese;
    // 意大利香肠
    private boolean pepperoni;
    // 番茄
    private boolean tomato;
    // 生菜
    private boolean lettuce;

    public Sandwich(SandwichBuilder builder) {
        this.size = builder.getSize();
        this.cheese = builder.isCheese();
        this.pepperoni = builder.isPepperoni();
        this.tomato = builder.isTomato();
        this.lettuce = builder.isLettuce();
    }

    @Override
    public String toString() {
        return "这是一个尺寸为:" + size + " 寸的三明治,包含: "
                +(cheese ? "奶酪 " : "")
                +(pepperoni ? " 意大利香肠 " : "")
                +(tomato ? " 番茄 " : "")
                +(lettuce ? " 生菜 " : "")
                ;
    }
}
