package 第148数组工具类Arrays;


import java.util.Arrays;

/**
 * @author yt13yt
 * @create 2019-11-17 17:12
 */
/*
* java.util.Arrays 是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组常见的操作
*
* public static String toString(数组)；将参数数组变成字符串，
* 按照默认格式：[元素1；元素2；元素3...]
*
* public static void sort(数组)；按照默认升序对数组进行排序
* 如果是数字，sort默认按照升序排列
* 自定义了类型需要与comp
* */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray={10,20,30};
        String intStr= Arrays.toString(intArray);
        System.out.println(intStr);

        int[] intArray1={1,3,4,5,5,6,7};
        Arrays.sort(intArray1);
        System.out.println(Arrays.toString(intArray1));

        strSortOut();

    }

    /*
    * 练习一，对随机字符串进行升序排列，倒叙输出
    * */

    public static void strSortOut()
    {
        String str="fgksdfkjgjfkgadkla";
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        for(int i=chars.length-1;i>=0;i--)
        {
            System.out.print(chars[i]);
        }
    }






}
