package org.ziyuan.factory.jdk_factory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * JDK源码解析-Collection.iterator  工厂方法模式
 * @author sunziyuan
 * @date 2024/6/9 21:32
 */
public class IteratorFactory {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("令狐冲");
        list.add("风清扬");
        list.add("任我行");

        //获取迭代器对象 工厂方法模式
        Iterator<String> it = list.iterator();
        //使用迭代器遍历
        while(it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }
    }
}
