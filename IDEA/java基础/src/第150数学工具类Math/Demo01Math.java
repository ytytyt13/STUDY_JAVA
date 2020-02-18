package 第150数学工具类Math;

/**
 * @author yt13yt
 * @create 2019-11-17 17:48
 */

/*
*java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学相关的操作
*
* public static double abs(double num);//获取绝对值
* public static double ceil(double num);//向上取整
* public static double floor(double num);//向下取整
* public static long round(double num);//四舍五入
*
* */
public class Demo01Math {
    public static void main(String[] args) {
        double num=3.14;
        System.out.println(Math.abs(num));
        System.out.println(Math.ceil(num));
        System.out.println(Math.floor(num));
        System.out.println(Math.round(num));
    }

}
