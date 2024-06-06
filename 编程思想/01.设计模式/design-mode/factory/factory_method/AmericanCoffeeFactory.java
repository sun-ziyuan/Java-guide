package factory_method;

/**
 * 美式咖啡工厂对象，专门用来生产美式咖啡
 * @author szy
 * @description
 * @date 2024/6/5 19:22
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
