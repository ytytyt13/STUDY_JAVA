package 第292并发与并行;

/**
 * @author yt13yt
 * @create 2019-11-25 21:02
 */
public class MythreadRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
