package 第292并发与并行;

/**
 * @author yt13yt
 * @create 2019-11-25 20:50
 */
/*
* 创建一个实现runnable接口的类，该类然后实现run方法，然后可以分配该类的实例
* Java.lang.Runnable 接口应该有那些打算通过某一线程执行其实例的类来实现
* 类必须定义成为run的无参数方法
* java.lang.Thread类的构造方法
*   Thread(Runnable target)  分配新的thread对象
*   Thread(Runnable target,String name) 分配新的thread对象
* 实现步骤
* 1.创建一个runnable接口的实现类
* 2.在实现类中重写runnable接口的run方法
* 3.创建一个runnable接口的实现类对象
* 4.创建thread类对象，构造方法中传递runnable接口实现类对象
* 5.调用thread类中的start方法，开启执行run方法
*
* Thread和Runnable的区别（Runnable的好处）
* 1.避免了单继承的局限性，如果类继承了thread类，则不能够继承其他的类
* 2.增强了程序的扩展性，降低了程序的耦合性
* */

public class Demo02MainThread {
    public static void main(String[] args) {
        Runnable run=new MythreadRunnable();
        Thread t=new Thread(run);
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
