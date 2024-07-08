package org.ziyuan.uml;

/**
 * --*
 * 聚合关系： 一台电脑由键盘、显示器、鼠标等组成,组成电脑的各个配件是可以从电脑上分离的,整体与部分可以分开
 * @author szy
 * @date 2023/5/22 17:43
 */
public class Computer {
    private Mouse mouse;     // 鼠标可以和电脑分离
    private Monitor moniter; // 显示器可以和电脑分离

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor moniter) {
        this.moniter = moniter;
    }
}
// 鼠标
class Mouse{

}
// 显示器
class Monitor{

}
