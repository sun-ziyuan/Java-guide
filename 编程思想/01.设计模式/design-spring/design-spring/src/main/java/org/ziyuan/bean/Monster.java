package org.ziyuan.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author szy
 * @description 妖怪
 * @date 2024/6/25 11:45
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Monster {
    private Integer id = 10;
    private String nickname = "牛魔王";
    private String skill = "芭蕉扇";

    public Monster() {
        System.out.println("monster 创建..");
    }
}
