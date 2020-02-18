package 第325lamdba表达式;

/**
 * @author yt13yt
 * @create 2019-11-27 21:48
 */
public class Demo01Cook {
    public static void main(String[] args) {
        //调用invokecook方法。传递cook接口的匿名内部类对象
        invokeCook(()->{System.out.println("吃饭了");}
        );
    }
    //定义一个方法，参数传递cook接口中的方法makefood
    public  static void invokeCook(Cook cook)
    {
        cook.makeafood();
    }
}
