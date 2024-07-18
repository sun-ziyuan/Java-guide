package org.ziyuan.brand.itguigu;

/**
 * @author sunziyuan
 * @date 2024/7/18 07:14
 */
public class Client {
    public static void main(String[] args) {
        // 获取折叠式手机（样式 + 品牌）
        Phone phone = new FoldedPhone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();
        System.out.println("================================================");
        Phone phone1 = new FoldedPhone(new Vivo());
        phone1.open();
        phone1.call();
        phone1.close();
        System.out.println("================================================");
        Phone phone2 = new UpRightPhone(new XiaoMi());
        phone2.open();
        phone2.call();
        phone2.close();
        System.out.println("================================================");
        Phone phone3 = new UpRightPhone(new Vivo());
        phone3.open();
        phone3.call();
        phone3.close();

    }
}
