package org.ziyuan.builder.news2;

// 客户端
public class Client {
    public static void main(String[] args) {
        // 通过 SandwichBuilder创建一个三明治实例, 通过链式调用的形式初始化各种属性,最后调用build方法构建出一个三明治
        Sandwich sandwich = new SandwichBuilder()
                .setSize(14)
                .addCheese()
                .addPepperoni()
                .addTomato()
                .addPepperoni()
                .build();
        // 输出: 这是一个尺寸为:14 寸的三明治,包含: 奶酪  意大利香肠  番茄
        System.out.println(sandwich.toString());
    }
}
