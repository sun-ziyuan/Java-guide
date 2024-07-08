package polymorphic;

/**
 * 狗
 * @author sunziyuan
 * @date 2024/7/6 16:43
 */
public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("汪汪汪~~~");
    }
}
