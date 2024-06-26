package org.ziyuan.prototype.shallowcopy;

public class ObjectClone{
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1. 创建对象
        int[] data = {1,2,3,4,5};
        User u1 = new User(1,"szy","123456",data);
        System.out.println("clone之前的对象:"+u1);       // User(id=1, username=szy, password=123456, data=[1, 2, 3, 4, 5])

        // 2. 浅拷贝: 基本数据类型拷贝值,字符串拷贝常量池地址,引用数据类型拷贝引用地址
        User u2 = (User) u1.clone();
        u2.getData()[0]=100;  // 修改u2.data数组  u1.data也会变
        u2.setPassword("666");

        // 3. 测试
        System.out.println("clone之后的对象:"+u1);       // User(id=1, username=szy, password=123456, data=[100, 2, 3, 4, 5])
        System.out.println("clone之后的对象:"+u2);       // User(id=1, username=szy, password=666, data=[100, 2, 3, 4, 5])
        System.out.println(u1.clone()==u2);                             // false
        System.out.println(u1.clone().getClass()==u2.getClass());       // true
    }
}