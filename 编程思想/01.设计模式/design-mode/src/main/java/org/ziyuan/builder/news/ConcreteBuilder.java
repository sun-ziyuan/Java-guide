package org.ziyuan.builder.news;

/**
 * 具体建造者类
 * @author szy
 * @description
 * @date 2024/7/16 11:27
 */
public class ConcreteBuilder implements Builder{

    Product dataJson = new Product();

    @Override
    public Builder buildReader(String val) {
        dataJson.setReader(val);
        return this;
    }

    @Override
    public Builder buildWriter(String val) {
        dataJson.setWriter(val);
        return this;
    }

    @Override
    public Builder buildSetting(String val) {
        dataJson.setSetting(val);
        return this;
    }

    @Override
    public Product build() {
        return this.dataJson;
    }
}
