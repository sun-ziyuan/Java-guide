package factory_method;

/**
 * 拿铁咖啡工厂对象，专门用来生产拿铁咖啡
 * @author szy
 * @description
 * @date 2024/6/5 19:25
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
