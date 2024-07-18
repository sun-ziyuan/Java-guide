package org.ziyuan.brand.itguigu;

/**
 * 折叠式手机类，继承、抽象类 Phone
 * @author sunziyuan
 * @date 2024/7/18 07:08
 */
public class FoldedPhone extends Phone{

    // 构造器
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠样式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠样式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠样式手机");
    }
}
