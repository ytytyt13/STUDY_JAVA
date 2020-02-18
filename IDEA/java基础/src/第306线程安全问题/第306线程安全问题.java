package 第306线程安全问题;

/**
 * @author yt13yt
 * @create 2019-11-25 21:36
 */
/*
*
*
* */

public class 第306线程安全问题 {
    //创建三个线程开始买票
    public static void main(String[] args) {
/*
        RunnableImpl run=new RunnableImpl();
        Thread p1=new Thread(run);
        Thread p2=new Thread(run);
        Thread p3=new Thread(run);
        p1.start();
        p2.start();
        p3.start();

        RunnableImpl02 run2=new RunnableImpl02();
        Thread p4=new Thread(run2);
        Thread p5=new Thread(run2);
        Thread p6=new Thread(run2);
        p4.start();
        p5.start();
        p6.start();*/
        RunnableImpl03 run3=new RunnableImpl03();
        Thread p7=new Thread(run3);
        Thread p8=new Thread(run3);
        Thread p9=new Thread(run3);
        p7.start();
        p8.start();
        p9.start();

    }

}
