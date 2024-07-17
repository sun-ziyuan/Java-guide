package org.ziyuan.adapter.news.interface_adapter;

/**
 * @author szy
 * @description
 * @date 2024/7/17 16:39
 */
public class Client {
    public static void main(String[] args) {
        PayGatewayAdapter payGatewayAdapter = new PayGatewayAdapter(){
            @Override
            public void unifiedOrder() {
                System.out.println("下单接口~~");
            }
        };
        payGatewayAdapter.query();
    }
}
