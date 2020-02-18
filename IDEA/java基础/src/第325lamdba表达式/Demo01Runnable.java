package 第325lamdba表达式;

/**
 * @author yt13yt
 * @create 2019-11-27 21:15
 */
/*
* 使用现实runnable接口的方式实现多线程程序，重写run方法，设置线程任务
* */
public class Demo01Runnable {
    public static void main(String[] args) {
        RunnableImpl run=new RunnableImpl();

        //创建thread对象，在狗仔方法中创建runnable接口的实现类
        Thread t=new Thread(run);

        t.start();

        //简化代码。使用匿名内部类

        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建");
            }
        }).start();
    }
}
