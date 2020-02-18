package 第411性能日志;

/**
 * @author yt13yt
 * @create 2019-12-05 19:03
 */

/*
* 例如：java.long.Runnable接口就是一个函数式接口
* 假设有一个startThread方法使用该接口作为参数，那么就可以使用Lambda进行参数传递
* 这种情况其实和Thread类的构造方法参数为Runnable没有本质的区别
*
* */
public class Demo01Runnable {
    //定义一个方法，方法的参数使用函数式接口Runnable
    public static void stratThread(Runnable run)
    {
        new Thread(run).start();
    }

    public static void main(String[] args) {
        //方法的参数是一个接口，
        stratThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"号线程启动了");
            }
        });


        stratThread(()->{System.out.println(Thread.currentThread().getName()+"号线程启动了");});

        //优化lambda表达式
        stratThread(()->System.out.println(Thread.currentThread().getName()+"号线程启动了"));

    }
}
