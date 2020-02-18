package 第292并发与并行;

/**
 * @author yt13yt
 * @create 2019-11-25 20:04
 */
public class Mythread extends Thread {
    public void run()
    {
        //获取线程名称
        String str=this.getName();
        System.out.println(str);

        Thread cur=currentThread();
        System.out.println(cur.getName());
    }

    public Mythread() {
    }

    public Mythread(String name) {
        super(name);
    }
}
