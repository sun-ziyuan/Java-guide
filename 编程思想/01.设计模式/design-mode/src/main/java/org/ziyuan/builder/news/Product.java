package org.ziyuan.builder.news;

import lombok.Setter;
import lombok.ToString;

/**
 * 产品类
 * @author szy
 * @description
 * @date 2024/7/16 11:24
 */
@Setter
@ToString
public class Product {
    // 读取
    private String reader;
    // 写入
    private String writer;
    // 设置
    private String setting;
}
