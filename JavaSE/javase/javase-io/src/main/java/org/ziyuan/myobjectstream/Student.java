package org.ziyuan.myobjectstream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Serializable接口: 里面没有抽象方法,标记型接口,
 *                  一旦实现了这个接口,那么就表示当前的Student类可以被序列化
 * @author szy
 * @description
 * @date 2024/6/19 14:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUUID = -12354679879234123L;

    private String name;
    private int age;
}
