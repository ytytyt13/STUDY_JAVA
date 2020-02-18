package 第323线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yt13yt
 * @create 2019-11-27 16:22
 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
    }

    /**
     * @author yt13yt
     * @create 2019-11-27 16:03
     */
    /*
    * jDK1.5之后提供了java.util.current.Executors:线程池的工厂类，用来生产线程池
    * Executors类中的静态方法：
    *   static ExecutorService newFixedThreadPool(int nThread);
    * 创建一个可重用固定线程池数量的线程池
    * 参数： 创建线程池中包含的线程数量
    * 返回值类型：返回的是ExecutorService接口的实现类对象，我们可以使用ExecutorService对象来接受
    * （面向接口编程）
    *
    * java.util.current.Executors线程池接口
    *   方法：
    *   submit(Runnable task)；取出线程，会调用start方法，然后执行线程任务
    *   shutdown()关闭线程池
    *使用步骤：
    * 1.使用线程池工厂类Exectors里面提供的静态啊方法newFixedThreadPool生产一个指定线程数量的线程池，
    * 2.创建一个类，实现Runnable接口，重写run方法，设置线程任务
    * 3.调用ExecutorService中的方法submit传递任务，开启线程，开启线程，执行run方法
    * 4.调用ExecutorService中的方法shutdown销毁线程池
    *
    * */

    public static class 第323线程池 {
        public static void main(String[] args) {
            //获取线程池
            ExecutorService es= Executors.newFixedThreadPool(2);

        }
    }
}
