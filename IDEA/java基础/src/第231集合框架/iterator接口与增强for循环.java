package 第231集合框架;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author yt13yt
 * @create 2019-11-18 16:21
 */
/*
* 迭代器
* java.util.Iterator
*
* 常用方法：
* Boolean hasNext();如果有元素可以迭代，则返回true，如果没有则返回false；
* E next();返回下一个元素；
* iterator 迭代器是一个接口，无法直接使用，需要使用iterator接口的实现类对象，获取实现类的方式比较特殊
* collection接口中有一个方法叫iterator（），这个方法返回的就是迭代器
*
* 迭代器的使用步骤：
* 1.先使用集合中的方法iterator，获取迭代器获取类对象，使用iterator类来接收
* 2.使用iterator中的hasNeat方法，判断有没有下一个元素
* 3.使用iterator中的next方法，取出下一个元素
* */

public class iterator接口与增强for循环 {

    public static void main(String[] args) {
        ArrayList<String> coll=new ArrayList<>();
        coll.add("姚明");
        coll.add("詹姆斯");
        coll.add("艾弗森");
        coll.add("科比");
        coll.add("麦迪");
        /*
        * 使用iterator（）获取接口
        * Iterator<E> ;
        *
        * */
        Iterator<String> iter=coll.iterator();
        System.out.println(iter.hasNext());
        //System.out.println(iter.next());  //姚明
        //System.out.println(iter.next()); //詹姆斯
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        demo01();


    }

    /*
     * 增强for循环，底层使用也是迭代器，简化了迭代器的书写
     *所有的单例集合，都可以使增强for循环
     * 增强for循环：用来实现遍历集合与数组
     * 格式：
     * for(集合/数组的数据类型 变量名：集合名/数组名)
     * {
     *   “处理语句”；
     * }
     *
     *
     *  */


    public static void demo01()
    {
        int[] arr={1,2,3,4,5};
        for(int i:arr)
        {
            System.out.println(i);
        }

        ArrayList<String> s=new ArrayList<>();
        s.add("aaa");
        s.add("bbb");
        for(String i:s)
        {
            System.out.println(i);
        }
    }
}
