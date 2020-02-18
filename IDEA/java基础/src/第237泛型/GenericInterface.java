package 第237泛型;

/**
 * @author yt13yt
 * @create 2019-11-18 18:52
 */

/*
* 定义含有泛型的接口,第一种使用方法；定义接口的实现类，实现接口，指定接口的的泛型
* public interface Iterator<E>
*{
*   E next();
*}
*
* Scanner类实现了iterator接口，并指定了接口的泛型为String类型，所以从写的next方法默认的是String
* public final class Scanner implemenets Iterator<String>
* {
*   public String next();
* }
* */
public interface GenericInterface<E>{
    public abstract void method(E e);
}
