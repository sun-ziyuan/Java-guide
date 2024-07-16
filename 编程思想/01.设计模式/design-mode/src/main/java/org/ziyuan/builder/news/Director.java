package org.ziyuan.builder.news;

/**
 * 指挥者
 * @author szy
 * @description
 * @date 2024/7/16 11:29
 */
public class Director {
    // 模拟 oracle -> mysql
    public Product buildOracle(Builder builder){
        return builder.buildReader("oracle")
                .buildWriter("mysql")
                .buildSetting("setting")
                .build();
    }

    // 模拟 sqlServlet -> mysql
    public Product buildSqlServlet(Builder builder){
       return builder.buildReader("sql_servlet")
                .buildWriter("mysql")
                .buildSetting("setting")
                .build();

    }

}
