package org.ziyuan.prototype.deepcopy;

import lombok.*;

import java.io.Serializable;

@Data
public class Citation implements Cloneable, Serializable {
    private Student student;

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show(){
        System.out.println(student.getName()+"同学: 在2020学年第一学期期中表现优秀,被评为三好学生。特发此状!! ");
    }
}

@Data
@AllArgsConstructor
class Student implements Serializable {
    // 学生姓名
    private String name;
}