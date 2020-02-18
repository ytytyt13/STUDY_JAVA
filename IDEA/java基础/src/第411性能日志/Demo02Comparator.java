package 第411性能日志;

import java.util.Comparator;

/**
 * @author yt13yt
 * @create 2019-12-05 19:15
 */
/*
* 如果一个方法的返回值类型是一个函数式接口，那么就可以直接
* 返回一个lambda表达式，当需要一个方法来获取java.util.compaarator接口类型的
* 对象作为排序器时，就可以掉该方法获取
* */
public class Demo02Comparator {
    //定义一个方法，方法的返回类型为接口Comparator
    public static Comparator<String> getComparator()
    {
        //方法的返回值类型是一个接口，那么我们可以返回这个接口的匿名内部类
        /*
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        };
        */
        return (String o1,String o2)-> {
            return o2.length() - o1.length();
        };
    }
}
