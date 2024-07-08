package polymorphic;

/**
 *  动物接口
 * @author sunziyuan
 * @date 2024/7/6 16:42
 */
public interface Animal extends A,B {
    // 发出声音
    void makeSound();
}
