package 第237泛型;

/**
 * @author yt13yt
 * @create 2019-11-18 18:21
 */
/*
* 定义含有泛型的方法，泛型定义在方法的修饰符与返回值之间
* 格式：
* 修饰符<泛型> 返回值类型 方法名(参数列表（使用泛型）)
* {
*   方法体;
* }
*
* 含有泛型的方法，在调用的方法的时候确定泛型的数据类型，
* 传递什么类型的参数，泛型就是什么类型
*
*
* */
public class GenericMethod {
    //含有泛型的方法
    public <M> void method01(M m)

    {
        System.out.println(m);
    }

    //静态方法不适合使用泛型
    public static <M> void method02(M m)
    {
        System.out.println(m);
    }
}
