package 第219Date类的构造方法与成员方法;


import javax.xml.crypto.Data;
import java.util.Date;



/**
 * @author yt13yt
 * @create 2019-11-14 21:22
 */

/*
*
*
* */
public class 第219Date类的构造方法与成员方法 {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    /*
    * Data类的空参数构造方法
    * Data()获取当前系统的日期和时间
    * */
    private static void  demo01()
    {
        Date date=new Date();
        System.out.println(date);   //Thu Nov 14 21:33:26 CST 2019
    }

    /*
    * Date类带参数的构造方法
    * Date(Long date) 传递毫秒值，把毫秒值转换为日期
    *
    * */
    private static void demo02()
    {
        Date date =new Date(0L);  //Thu Jan 01 08:00:00 CST 1970
        System.out.println(date);
        date =new Date(034454646456547L);  //Fri Apr 02 20:24:06 CST 2032
        System.out.println(date);
    }

    /*
    * getTime方法
    * Long getTime()把日期转换为毫秒值
    * 返回自1970年1月1日00：00：00到当前时间的毫秒值
    * 相当于System.currentTimeMillis()方法
    * */
    public static void demo03()
    {
        Date date=new Date();
        long time=date.getTime();
        System.out.println(time);  //1573739122945
    }
}


