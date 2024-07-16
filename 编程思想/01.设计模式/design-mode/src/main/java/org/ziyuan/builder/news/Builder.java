package org.ziyuan.builder.news;

import lombok.val; /**
 * 抽象建造者类
 * @author szy
 * @description
 * @date 2024/7/16 11:25
 */
public interface Builder {

    // 构建读取
    Builder buildReader(String val);
    // 构建写入
    Builder buildWriter(String val);
    // 构建设置
    Builder buildSetting(String val);
    // 获取对象
    Product build();
}
