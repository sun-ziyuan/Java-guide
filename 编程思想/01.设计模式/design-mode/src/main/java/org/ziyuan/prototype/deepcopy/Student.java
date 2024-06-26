package org.ziyuan.prototype.deepcopy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student implements Serializable {
    // 学生姓名
    private String name;

}