package 第306线程安全问题;

/**
 * @author yt13yt
 * @create 2019-11-26 17:56
 */

/*
* 买票案例出现了安全问题，
* 1.可以使用同步代码块完成
* 格式：
* synchronized(锁对象)
* {
*      可能出现线程安全问题的代码；
* }
* 注意：
* 1.通过代码块中的锁对象，可以使用任意的对象
* 2.但是必须保证多个线程使用的锁对象是同一个
* 3.锁对象的作用：
*   把同步代码块锁住，只让一个线程在同步代码块中执行
*同步的原理：
* 使用了一个锁对象，这个锁对象叫做同步锁，也叫做对象锁（对象监视器）
* 3个线程一起抢夺cpu的执行权，谁抢到了谁执行run方法
*   t0抢到了cpu的执行权，执行run方法，遇到synchornized代码块
*   这时t0会检查同步代码块是否有锁对象，发现有，就会获取锁对象，就会进入到锁对象进行执行
*
* t1抢到了cpu的执行权，执行run方法，遇到synchornized代码块
 *   这时t0会检查同步代码块是否有锁对象，发现没有，就不会获取锁对象，就会进入阻塞状态，会一直等待t0线程归还锁对象
 * 一直等到t0执行完毕，归还锁对象，t1才能够执行
 *
 * 总结：同步中的线程，没有执行完毕，不会归还锁对象，没有锁对象的线程，不能够进入到同步代码块中执行
*程序会频繁的获得锁，判断锁，释放锁，效率较低
* */
public class RunnableImpl implements Runnable {
    //定义多个线程共享的票源
    private int ticket=100;
    //创建锁对象
    Object obj=new Object();
    @Override
    public void run() {
        while(true){
           synchronized (obj)
           {
               if(ticket>0)
               {
                   System.out.println(Thread.currentThread().getName()+"正在卖第："+ticket+"张票");
                   ticket--;
               }
               else
                   break;
           }
        }
    }
}
