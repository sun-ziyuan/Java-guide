package org.ziyuan.builder.news;

/**
 * 三明治建造者类,
 * @author sunziyuan
 * @date 2024/7/15 21:49
 */
public class SandwichBuilder {
    // 尺寸
    private int size;
    // 奶酪
    private boolean cheese = false;
    // 意大利香肠
    private boolean pepperoni = false;
    // 番茄
    private boolean tomato = false;
    // 生菜
    private boolean lettuce = false;

    // 设置完成后，返回this,以便于链式调用
    public SandwichBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public SandwichBuilder addCheese() {
        this.cheese = true;
        return this;
    }

    public SandwichBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public SandwichBuilder addTomato() {
        this.tomato = true;
        return this;
    }

    public SandwichBuilder addLettuce() {
        this.lettuce = true;
        return this;
    }

    public int getSize() {
        return size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    // 更具当前配置,创建并返回一个新的Sandwlch（三明治）实例
    public Sandwich build(){
        return new Sandwich(this);
    }
}
