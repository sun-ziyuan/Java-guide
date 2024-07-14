package org.ziyuan.factory2.abstractfactory;

import com.sun.xml.internal.ws.util.StringUtils;
import org.ziyuan.factory2.abstractfactory.ali.AliOrderFactory;
import org.ziyuan.factory2.abstractfactory.wechat.WeChatOrderFactory;

/**
 * 超级工厂创造器,简单工厂模式
 * @author sunziyuan
 * @date 2024/7/14 17:40
 */
public class FactoryProducer {
    public static OrderFactory getFactory(String type){
        if(type != null){
            switch (type){
                case "WeChat":
                    return new WeChatOrderFactory();
                case "Ali":
                    return new AliOrderFactory();
            }
        }
            return null;
    }
}
