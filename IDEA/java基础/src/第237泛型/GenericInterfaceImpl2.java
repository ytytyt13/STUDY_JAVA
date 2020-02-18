package 第237泛型;

/**
 * @author yt13yt
 * @create 2019-11-18 19:10
 */
/*
* 含有泛型的接口第二种使用方法，接口使用什么类型，类跟着接口走
* 就相当于定义了一个含有泛型的类，创建对象的时候确定对象的类型
* */
public class GenericInterfaceImpl2<E> implements GenericInterface<E>{
    @Override
    public void method(E e) {
        System.out.println(e);
    }
}
