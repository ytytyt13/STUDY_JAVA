package 第318线程间的通信;

/**
 * @author yt13yt
 * @create 2019-11-26 22:28
 */
public class ChiHuo extends Thread{
    private BaoZi baoZi;
    public ChiHuo(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        int count=0;
        while(true) {
            synchronized (baoZi) {
                if (baoZi.flag == false) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后
                System.out.println("正在吃"+baoZi.pi+baoZi.xian+"的包子");
                baoZi.flag=false;
                baoZi.notify();
                System.out.println("已吃完包子");
                System.out.println("**************************");

            }
        }
    }



}
