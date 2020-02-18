package 第323线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yt13yt
 * @create 2019-11-27 16:29
 */
/*
* 线程池：jDK1.5之后提供的
* java.util.concurrent.Executors；线程池工厂类，用来生产线程池
* Executors类中的静态方法：
*   static ExecutorService newFixedThreadPool(int thread);
*   创建一个可以重用固定线程数的线程池
*   方法：
*   submit（），提交一个runnable实现类，用于执行任务
*
*
*
* */
public class Demo01ThreadPool {
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(2);
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        /*
        pool-1-thread-2创建了一个新的线程
        pool-1-thread-1创建了一个新的线程
        pool-1-thread-1创建了一个新的线程
        * */
        es.shutdown();
    }
}
