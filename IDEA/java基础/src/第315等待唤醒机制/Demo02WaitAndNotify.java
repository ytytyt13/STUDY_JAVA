package 第315等待唤醒机制;

/**
 * @author yt13yt
 * @create 2019-11-26 20:28
 */

/*
* 进入到timwaitting有两种方式，
* 1.使用sleep（long m）方法，在毫秒值结束后，线程睡醒进入到runnable/blocked状态
* 2.使用wait（long m）方法。wait方法如果在毫秒值结束之后，还没有接收到notify唤醒，就会自动醒来
*
*
* 唤醒有两种方法：
* 1.notify;
* 2.notifyAll();
* */
public class Demo02WaitAndNotify {
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

        new Thread(){
            @Override
            public void run() {

                //保证等待与唤醒的线程只有一个在执行，需要使用同步技术
                synchronized (obj)
                {
                    System.out.println("1告诉老板需要包子");
                    //将进入等待
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("1正在吃包子");
                }
            }
        }.start();

        new Thread()
        {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("做包子,告知顾客可以吃包子");
                    obj.notifyAll();
                }
            }
        }.start();

    }
}
