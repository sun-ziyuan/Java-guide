package org.ziyuan.uml.aggregation;

/**
 * @author szy
 * @description
 * @date 2024/7/12 11:02
 */
public class Computer {
    private Mouse mouse;
    private Monitor monitor;

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}

class Mouse{}
class Monitor{}