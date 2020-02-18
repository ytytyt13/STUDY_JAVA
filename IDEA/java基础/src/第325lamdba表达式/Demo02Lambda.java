package 第325lamdba表达式;

/**
 * @author yt13yt
 * @create 2019-11-27 21:33
 */
/*
* 使用匿名内部类的方式实现多线程。
* 好处：不用去实现这个类。
* 坏处：
* Lambda表达式的标准格式：
* 由三部分组成：
* a.一些参数
* b.一个箭头
* c.一段代码
* (参数列表)->{函数体}
* 解释说明：
* ()参数列表，没有参数就空着，有参数就传递给方法体
* ->传递符号
* {}重写的方法的方法体
* */
public class Demo02Lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"num1");
            }
        }).start();


        //使用lambda表达式，实现多线程
        new Thread(()->
        {
            System.out.println(Thread.currentThread().getName()+"num2");
        }
        ).start();
    }


}

