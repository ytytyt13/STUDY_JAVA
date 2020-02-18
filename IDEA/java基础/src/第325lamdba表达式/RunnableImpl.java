package 第325lamdba表达式;

/**
 * @author yt13yt
 * @create 2019-11-27 21:21
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新线程创建");
    }
}
