package 第315等待唤醒机制;

/**
 * @author yt13yt
 * @create 2019-11-26 19:30
 */

/*
* 等待唤醒案例
*  创建一个顾客线程（消费者）：告诉老板包子与数量
*  创建一个老板线程（生产者）：生产完毕后告诉消费者（notify）。
* 注意：
* 顾客老板线程必须使用同步代码块包躲起来，保证等待与唤醒只能够有一个执行
* 只有锁对象才能够调用wait与notify方法
* object类中的方法
* void wait（）
*  在其他线程调用此对象的notify（）方法或则notifyall方法，导致当前线程等待
* void notify（）
*  唤醒在此对象监视器上等待的单个线程
*  会继续执行wait方法之后的代码
*
*
* */
public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj=new Object();
        new Thread(){
            @Override
            public void run() {
                //保证等待与唤醒的线程只有一个在执行，需要使用同步技术
                synchronized (obj)
                {
                    System.out.println("告诉老板需要包子");
                    //将进入等待
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("正在吃包子");
                }
            }
        }.start();

        new Thread()
        {
            @Override
            public void run() {
                    synchronized (obj) {
                        System.out.println("做包子,告知顾客可以吃包子");
                        obj.notify();
                    }
            }
        }.start();
     }
}
