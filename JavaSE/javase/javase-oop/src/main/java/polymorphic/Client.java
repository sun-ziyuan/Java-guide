package polymorphic;

/**
 * @author sunziyuan
 * @date 2024/7/6 16:44
 */
public class Client {
    public static void main(String[] args) {
        // 1. Dog是Animal的实现类
        Animal dog = new Dog();
        dog.makeSound();
        // 2. Cat 通过继承 Dog类 间接地与 Animal 接口相关联
        //   即: Cat 继承了 Dog,意味着 Cat继承了Dog类的所有非私有属性和方法,(包括从 Animal 接口继承的方法)
        Animal puppy = new Puppy();
        puppy.makeSound();
    }
}
