package org.ziyuan.brand.itguigu;

/**
 * @author sunziyuan
 * @date 2024/7/18 07:23
 */
public class UpRightPhone extends Phone{

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("直立样式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("直立样式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("直立样式手机");
    }

}
