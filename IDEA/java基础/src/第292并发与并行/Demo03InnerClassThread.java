package 第292并发与并行;

/**
 * @author yt13yt
 * @create 2019-11-25 21:21
 */
/*
* 匿名内部类方式实现线程的创建
* 匿名：没有名字
* 内部类：写在其他类内部的类
*
* 匿名内部类的作用：简化代码
*   把子类继承父类，重写父类的方法，创建子类对象一步完成
*   把实现类的实现接口，重写接口中的方法，创建实现类的对象合成一步完成
* 匿名内部类的最终产物：子类/实现类对象，而这个类没有名字
*
* 格式：
* new 父类/接口()
* {
*   重写父类/接口中的方法;
* }
* */

public class Demo03InnerClassThread {
    public static void main(String[] args) {
        //线程的父类是Thraed
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        }.start();

        //线程接口
        Runnable r=new Runnable()
        {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+":runnable+:"+i);
                }
            }
        };
        new Thread(r).start();
    }
}
