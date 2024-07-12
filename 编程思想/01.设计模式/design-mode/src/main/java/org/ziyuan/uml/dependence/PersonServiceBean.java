package org.ziyuan.uml.dependence;

/**
 * @author szy
 * @description
 * @date 2024/7/11 16:22
 */
public class PersonServiceBean {

    public void save(Person person){
        new Person();			// 添加
    }

    public IDCard getIDCard(Integer personId){
        return new IDCard();	// 获取
    }

    public void modify(){
        // 注意: 局部变量是类对象,不符合迪米特法则,这里只是用于理解依赖关系
        Department department = new Department();	// 修改
    }
}

class IDCard{}
class Person{}
class Department{}