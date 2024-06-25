package org.ziyuan.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author szy
 * @description 原型测试类
 * @date 2024/6/25 14:29
 */
public class PrototypeTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");
        // 获取monster[通过id获取monster] 断点
        Object id01 = applicationContext.getBean("id01");
        System.out.println("bean" + id01);

        Object id02 = applicationContext.getBean("id01");
        System.out.println("bean" + id02);

        System.out.println("id01==id02: "+ (id01 == id02));
    }
}
