package org.ziyuan.factory.config_factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 加载配置文件,获取配置文件中配置的全类名,并创建该类的对象进行存储
 * @author sunziyuan
 * @date 2024/6/9 10:48
 */
public class CoffeeFactory {

    // 1. 定义容器对象存储对象
    private static Map<String,Coffee> map = new HashMap<>();
    // 2. 加载配置文件,只需要加载一次
    static {
        // 1. 加载配置文件,只需要加载一次
        Properties properties = new Properties();
        // 2. 调用 properties 中的load()进行配置文件的加载
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(is);
            // 从p集合中获取全类名并创建对象
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                String property = properties.getProperty((String) key);
                // 通过反射技术创建对象
                Class aClass = Class.forName(property);
                Coffee o = (Coffee) aClass.newInstance();
                map.put((String) key,o);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // 根据名称获取对象
    public static Coffee createCoffee(String name){
        return map.get(name);
    }
}
