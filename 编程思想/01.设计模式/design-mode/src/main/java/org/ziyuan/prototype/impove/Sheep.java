package org.ziyuan.prototype.impove;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author szy
 * @description 羊
 * @date 2024/6/24 17:10
 */
@AllArgsConstructor
@ToString
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;

    @Override
    protected Sheep clone(){
        Sheep clone = null;
        try {
            clone = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }
}
