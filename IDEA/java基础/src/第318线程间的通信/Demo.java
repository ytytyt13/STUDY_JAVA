package 第318线程间的通信;

/**
 * @author yt13yt
 * @create 2019-11-26 22:32
 */
public class Demo {
    public static void main(String[] args) {
        BaoZi baoZi=new BaoZi();

        new BaoZiPu(baoZi).start();

        new ChiHuo(baoZi).start();
    }

}
