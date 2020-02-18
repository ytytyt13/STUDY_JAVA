package 第292并发与并行;

import java.beans.IntrospectionException;

/**
 * @author yt13yt
 * @create 2019-11-25 19:44
 */


/*
* 主线程：执行主方法的线程
* 单线程程序：Java程序中只有一个线程，执行从main方法开始，从上到下依次执行
*
* 创建线程的两种方法：
* 1.将类声明为Thread类的子类，该子类重写thread类的run方法，接下来可以分配启动该子类的实例
*   Java.lang.Thread类
* 实现步骤：
* 1.创建thread的子类，
* 2.重写thread的run方法，设置线程任务
* 3.调用thread方法中的run方法，开启新的线程
*       是该线程来执行run方法
*       多次启动一个线程是非法的，当一个线程已经结束执行后，不能够再重新执行
* java程序属于抢占式调度。
*
* 4.常用方法：
* 1.获取线程的名称
*   使用Thread类中的方法getName()
*       String getName() 返回该线程的名称
*    可以获取当前正在执行的线程，可以使用getname()得到名称
*       static Thread currentThread() 返回当前正在执行的线程对象的引用
* 2.设置线程的名称
*       setName(String name);
*    创建一个带参数的构造方法，参数传递线程名称，调用父类的带参构造方法，把线程名称传递给父类
*    让父线程给子线程起一个名字
* 3.暂停线程
*    public static void sleep(long millis); 是当前正在执行的线程以指定的毫秒数暂停
* 毫秒数结束之后，线程继续执行
*
* */


public class Demo01MainThread {
    public static void main(String[] args) {

        Mythread mt=new Mythread();
        mt.start();  //thread-0

        Mythread mt1=new Mythread();
        mt.setName("小强");
        mt1.start();

        Mythread mt2=new Mythread("旺财");
        mt2.start();

        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i <60; i++) {
            //使用thread的sleep方法，让程序暂停1秒
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
