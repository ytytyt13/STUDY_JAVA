package 第306线程安全问题;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author yt13yt
 * @create 2019-11-26 18:59
 */

/*
* 第三种解决方案。lock锁
* lock中的方法中有两个，lock与unlock
* 使用步骤：
* java.util.concurrent.Locks.Reentrantlock implements Lock
* 1.在成员我位置创建一个renntrantlaoc对象
* 2.在可能出现线程安全的代码前调用lock接口中的lock获取锁
*   在可能出现安全问题的代码后释放lock接口中的unlock释放锁
*
* */
public class RunnableImpl03 implements Runnable {
    //定义多个线程共享的票源
    private int ticket=100;
    //创建锁对象
    Lock l=new ReentrantLock();
    @Override
    public void run() {
        while(true){
                l.lock();
                if(ticket>0)
                {
                    System.out.println(Thread.currentThread().getName()+"正在卖第："+ticket+"张票");
                    ticket--;
                }
                else
                    break;
                l.unlock();
        }
    }

}