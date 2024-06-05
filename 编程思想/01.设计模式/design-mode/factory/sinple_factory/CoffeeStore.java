package sinple_factory;


/**
 * 咖啡店
 * @author szy
 * @description
 * @date 2024/6/4 17:37
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {

        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        // 调用生产咖啡的方法
        Coffee coffee = factory.createCoffee(type);
        // 添加配置
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
