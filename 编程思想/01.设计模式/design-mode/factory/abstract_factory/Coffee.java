package abstract_factory;

/**
 * 咖啡抽象类
 * @author sunziyuan
 * @date 2024/6/7 06:39
 */
public abstract class Coffee {
    public abstract String getName();

    // 加糖
    public void addMilk(){
        System.out.println("加糖");
    }

    // 加奶
    public void addSugar(){
        System.out.println("加奶");
    }

}
