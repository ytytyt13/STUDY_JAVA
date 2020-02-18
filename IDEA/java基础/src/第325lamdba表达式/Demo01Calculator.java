package 第325lamdba表达式;

/**
 * @author yt13yt
 * @create 2019-11-27 22:04
 *
 *
 */

/*
* lambda表达式可推导，可以省略，
* 凡是可以根据上下文推导出来的内容，都可以省略书写
* 1.参数列表；括号中参数列表的参数类型，可以省略不写
* 2.参数列表：括号中只有一个参数，那么类型可以省略
* 3.只有一行代码，可以省略{}，return,分号;
* 要省略就要一起省略，
*
*
* */
public class Demo01Calculator {
    public static void main(String[] args) {
        invlkeCalc(5,6,(int a,int b)->
        {
            return a+b;
        }
        );
    }

    //定义一个方法
    public static void invlkeCalc(int a,int b,Calculator c)
    {
        int sum=c.calc(a,b);
        System.out.println(sum);
    }
}
