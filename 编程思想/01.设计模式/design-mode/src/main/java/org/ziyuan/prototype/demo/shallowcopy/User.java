package org.ziyuan.prototype.demo.shallowcopy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class User implements Cloneable{
    private int id;             // id
    private String username;    // 用户名
    private String password;    // 密码
    private int[] data;         // 数据

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 让Java帮我们克隆一个对象,并把克隆之后的对象返回出去。
        return super.clone();
    }
}
