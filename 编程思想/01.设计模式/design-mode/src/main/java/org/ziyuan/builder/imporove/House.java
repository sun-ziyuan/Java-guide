package org.ziyuan.builder.imporove;

import lombok.Getter;
import lombok.Setter;

/**
 * @author szy
 * @description 产品 -> Product
 * @date 2024/6/26 14:31
 */
@Getter
@Setter
public class House {
    // 地基
    private String basic;
    // 砌墙
    private String wall;
    // 屋顶
    private String roofed;
}
