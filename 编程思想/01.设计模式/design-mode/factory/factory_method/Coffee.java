package factory_method;

/**
 * 咖啡类
 * @author szy
 * @description
 * @date 2024/6/5 19:13
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
