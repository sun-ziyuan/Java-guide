package abstract_factory;

/**
 * 意大利风味甜品工厂
 *    生产: 拿铁咖啡、提拉米苏
 * @author sunziyuan
 * @date 2024/6/7 06:56
 */
public class ItalyDessertFactory implements DessertFacotry{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
