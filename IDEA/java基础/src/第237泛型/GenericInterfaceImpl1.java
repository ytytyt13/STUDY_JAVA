package 第237泛型;

/**
 * @author yt13yt
 * @create 2019-11-18 19:02
 */

/*
* 在类的继承中就指明类型
* */
public class GenericInterfaceImpl1<String> implements GenericInterface<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
