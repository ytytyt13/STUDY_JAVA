package 第409函数式接口;

import java.awt.im.InputMethodRequests;

/**
 * @author yt13yt
 * @create 2019-12-05 18:26
 */
/*
*函数式接口的使用，一般可以作为方法的参数或则返回值使用
* */
public class Demo {
    //作为参数使用
    public static void show(MyFunctionalInterface myInter)
    {
        myInter.method();
    }

    public static void main(String[] args) {
        //调用show()方法，方法的参数是一个接口，所以可以传递接口的实现类对象
        show(new MyFunctionalInterfaceImpl());

        //调用show()方法，方法的参数是一个接口，所以可以传递接口的匿名内部类
        show(new MyFunctionalInterface() {
                 @Override
                 public void method() {
                     System.out.println("使用匿名内部类重写接口中的抽象方法");
                 }
             }
        );
        //调用show()方法，方法参数是一个函数式接口，所以我们可以使用lambda表达式
        show(()->{System.out.println("使用lambda表达式重写接口中的抽象方法");
        }
        );

        //简化版的lambda表达式
        show(()->System.out.println("简化版的lambda"));
    }
}
