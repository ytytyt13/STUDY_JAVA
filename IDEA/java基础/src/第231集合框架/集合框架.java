package 第231集合框架;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author yt13yt
 * @create 2019-11-18 15:48
 */
/*
* 集合架构
* 1，Vector集合
* 2，ArrayList集合
* 3，LinkList集合
* 4，TreeSet集合
* 5，HashSet集合
* 6，LinkedHashSet集合
*
* 学习目标
* 1.会使用集合存储数据
* 2.会遍历集合，把数据取出来
* 3.掌握每种集合的特性
*
* collection接口：
* 定义所有单例集合中共性的方法
* 没有带索引的方法
*
* List接口：（vector,ArrayList,LinkedList）
* 1.有序的集合，存储与取出元素顺序相同
* 2，允许存储重复元素
* 3，有索引，可以使用for循环遍历
*
* Set接口：（TreeSet（无序的，存储的顺序有可能不一致），HashSet（无序的）-》LinkedHashSet（有序的））
* 1,不允许有重复元素
* 2，没有索引，不能够使用for循环遍历
*
*
*
* collection共性的方法
* public boolean add<E e>;在集合中加入元素
* public void clear();清空集合中所有的元素
* public boolean remove(E e);把给定元素在当前集合删除,集合中不存在元素，则删除失败
* public boolean contain(E e);判断当前集合是否包含该元素
* public boolean isEmpty(); 判断元素是否为空
* public int size();  //返回集合中元素的个数
* public Object[] toArray(); 把集合元素变为数组
* */

public class 集合框架 {
    public static void main(String[] args) {
        //创建对象可以使用多态
        ArrayList<String> coll=new ArrayList<>();
        System.out.println(coll);
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll);
        coll.remove("张三");
        System.out.println(coll);
        System.out.println(coll.contains("李四"));
        System.out.println(coll.isEmpty());

    }
}
