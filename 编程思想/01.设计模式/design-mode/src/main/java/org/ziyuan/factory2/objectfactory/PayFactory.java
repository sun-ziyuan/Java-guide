package org.ziyuan.factory2.objectfactory;

/**
 * @author sunziyuan
 * @date 2024/7/13 15:01
 */
public class PayFactory {

    /**
     * 根据参数,返回对应的支付对象
     * @return
     */
    public static Pay createPay(String payType){
        // 声明支付类型变量,根据不同类型创建不同类型的支付方法
        if(payType != null){
            switch (payType){
                case "aliPay":
                    return new AliPay();
                case "weChatPay":
                    return new WeChatPay();
                case "payPly":
                    return new PayPly();
            }
        }
        return null;
    }
}
