package 第409函数式接口;

/**
 * @author yt13yt
 * @create 2019-12-05 18:14
 */
/*
* 函数式接口：
* 有且仅有一个抽象方法的接口，当然接口中可以包含其他方法（静态，默认，私有）
*
* */
@FunctionalInterface  //可以检测接口是否是一个函数式接口，
//是，编译成功
//否，编译失败，接口中的抽象方法个数不为一
public interface MyFunctionalInterface {
    public abstract void method();

}
