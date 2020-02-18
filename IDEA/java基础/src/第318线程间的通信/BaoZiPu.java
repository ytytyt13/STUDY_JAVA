package 第318线程间的通信;

/**
 * @author yt13yt
 * @create 2019-11-26 22:14
 */

/*包子铺线程*/
public class BaoZiPu extends Thread{
    private BaoZi baoZi=new BaoZi();

    public BaoZiPu(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        int count=0;
        while(true) {
            synchronized (baoZi) {
                if (baoZi.flag == true) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //生产包子
                if (count % 2 == 0) {
                    baoZi.pi = "薄皮";
                    baoZi.xian = "三鲜";
                } else {
                    baoZi.pi = "厚皮";
                    baoZi.xian = "牛肉";
                }
                count++;
                System.out.println("包子铺正在生产" + baoZi.pi + baoZi.xian + "包子");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                baoZi.flag = true;
                baoZi.notify();
                System.out.println("包子铺已生产好" + baoZi.pi + baoZi.xian + "包子,可以开始吃了");
            }
        }
    }
}
