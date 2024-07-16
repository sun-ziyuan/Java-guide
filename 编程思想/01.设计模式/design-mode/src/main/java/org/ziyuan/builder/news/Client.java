package org.ziyuan.builder.news;

/**
 * @author szy
 * @description
 * @date 2024/7/16 11:49
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.buildOracle(new ConcreteBuilder());
        System.out.println(product.toString());

        Product product1 = director.buildSqlServlet(new ConcreteBuilder());
        System.out.println(product1.toString());
    }
}
