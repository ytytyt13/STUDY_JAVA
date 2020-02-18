package 第220DateFormat类和SimpleDateF;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * @author yt13yt
 * @create 2019-11-14 21:47
 */

/*
* java.text.DateFormat 是日期格式化子类的抽象类
* 作用
* 格式化：日期->字符串
* 解析：字符串->日期
* 成员方法：
* String foramt(Date date) 按照指定的格式，把date日期转化为符合模式的字符串
* Date parse（String source） 把符合模式的字符串解析为Date日期对象
*
*
* 该类无法实例化，是一个抽象类，可以使用子类来创建对象
* 一般使用方法：
* java.text.SimpleDateFormat extends DateFormat
*
* 构造方法：
* SimpleDateFormat(String pattern)
* 给定模式和默认的语言环境构造SimpleDateFormat
* 参数： pattern 传递指定的模式
* 模式：y 年
*      M 月
*      d 天
*      H 小时
*      m 分钟
*      s 秒
* 写对应的模式，会将该模式替换为时间格式
* 注意：
* 模式中的字母不能够改变，链接符可以改变
*yy-MM-dd-HH-mm-ss
* */
public class 第220DateFormat类和SimpleDateF {
    public static void main(String[] args) throws ParseException {
        deom01();
        demo02();
    }


    /*
    * 使用DateFormat类中的方法format，把日期格式化为文本
    * 使用步骤：
    * 1.创建SimpleDateFormat对象，构造参数传递指定的模式
    * 2.调用SimpleDateFormat对象中的format方法，按照构造方法中的指定模式，把Date日期格式化为符合模式的字符串
    *
    * */
    public static void deom01()
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

        Date date=new Date();
        String str=sdf.format(date);
        System.out.println(str);
    }

    /*
    * 使用步骤：
    * 1.创建SimpleDateFormat对象，构造参数传递指定的模式
    * 2.调用SimpleDateFormat对象中的parse方法，按照构造方法中的指定模式，把字符串转化为Date日期格式化为符合模式
    *
    * */
    public static void demo02() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd-HH-mm-ss");
        Date date=sdf.parse("2019-11-18-23-11-23");
        System.out.println(date);
    }
}
