package org.ziyuan.adapter.news.interface_adapter;

/**
 * @author szy
 * @description
 * @date 2024/7/17 17:05
 */
public class ProductUnifyOrder extends PayGatewayAdapter{

    @Override
    public void unifiedOrder() {
        System.out.println("统一下单~~~");
    }

    @Override
    public void refund() {
        System.out.println("统一退款~~~");
    }
}
