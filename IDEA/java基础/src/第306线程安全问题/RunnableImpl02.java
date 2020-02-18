package 第306线程安全问题;

import java.sql.DataTruncation;

/**
 * @author yt13yt
 * @create 2019-11-26 18:44
 */
/*
 * 买票案例出现了安全问题，
 * 2.使用同步方法
 * 步骤：
 * 1.把访问共享数据的代码抽取出来，放到一个方法中，
 * 2.在方法上添加synchronized的修饰符
 *  格式：
 *    修饰符 synchronized 返回值类型 方法名（参数列表）
 * {
 * }
 *
 * 同步方法也会将内部的方法锁住，也只会让一个线程执行
 * 就是实现类对象 new Runnable
 *
 * */
public class RunnableImpl02 implements Runnable {
    //定义多个线程共享的票源
    private static int ticket=100;
    //创建锁对象

    @Override

    public void run() {
            while(true)
            {
                payTicket01();
            }

    }

    public synchronized void payTicket()
    {
        if(ticket>0)
        {
            System.out.println(Thread.currentThread().getName()+"正在卖第："+ticket+"张票");
            ticket--;
        }

    }

    /*
    * 静态的同步方法的锁对象，不能够是this对象，静态方法优先于对象，
    * 静态方法的锁对象是本类的锁对象，
    *
    * */
    public static synchronized void payTicket01()
    {
        if(ticket>0)
        {
            System.out.println(Thread.currentThread().getName()+"正在卖第："+ticket+"张票");
            ticket--;
        }

    }
}
