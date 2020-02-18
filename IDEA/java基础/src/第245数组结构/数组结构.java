package 第245数组结构;

import java.lang.reflect.Array;
import java.util.*;
import 第125对象数组ArrayList.Person;

/**
 * @author yt13yt
 * @create 2019-11-18 20:59
 */

/*
* Collection
* --List
*   --LinkedList<双端链表>
*   --Vector
*   --ArrayList<数组>
* --Set
*   --TreeSet
*   --HashSet
* --Map
*   --TreeMap
*   --HashMap
*     --LinkedHashMap
* --Stack<栈>
* --
*
*
*
*
* */
public class 数组结构 {
    public static void main(String[] args) {
       /*
       * 1.Stack栈（先进后出）
       *   Stack<String> st=new Stack<String>();
       *   --boolean empty();//测试堆栈元素是否为空
       *   --Object peek();//查看堆栈顶部的对象，但不从堆栈中移除它
       *   --Object pop();//移除堆栈顶部的对象，并作为此函数的值返回该对象
       *   --Object push(Object element);//压入元素
       *   --int search(Object element)；//返回对象在堆栈中的位置，以 1 为基数
       * */

        Stack<String> st=new Stack<>();
        st.push("a");
        st.add("s");
        st.push("b");
        st.push("c");
        st.push("d");
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.search("c"));
        System.out.println(st.search("a"));

        /*
        * List接口（包含ArrayList,LinkedList）
        * 1.有序的集合
        * 2.有索引
        * 3.可以重复
        * 特有的方法：
        * 1.public void add(int index,E e);将指定的元素添加到集合指定的位置上
        * 2.public E get(int index);返回集合中指定位置得元素
        * 3.public E remove(int index);删除并返回指定位置的元素
        * 4.public E set(int index,E e);用指定的元素替换指定位置得元素
        * 注意事项，操作时防止越界
        *
        * */

        /*
        * ArrayList集合
        * 底层数组结构
        * */
        ArrayList<String> list=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);
        list.add(1,"*");
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.remove(1));
        list.set(1,"*");
        System.out.println(list);

        //List遍历有三种方式
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

        Iterator<String> iter=list.iterator();
        while(iter.hasNext())
        {
            System.out.print(iter.next());
        }

        for(String s:list)
        {
            System.out.print(s);
        }




        /*
        * 2.LinkedList(队列也可以)
        * 底层是链表
        * 包含大量收尾的操作
        * addFirst()
        * addLast()
        * getFirst()
        * getLast()
        * removeFirst()
        * removeLast()
        * */
        LinkedList<String> linked=new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        linked.addFirst("*");
        linked.addLast("*");
        System.out.println(linked);
        linked.removeFirst();
        linked.removeLast();
        System.out.println(linked);
        System.out.println(linked.getFirst());
        System.out.println(linked.getLast());

        /*
        * Vector集合
        * 可以实现可增长的对象数组，与ArrayList相同
        * */


        /*
        * Set接口（包含TreeSet，HashSet）
        * 1.不允许有重复的元素
        * 2.没有索引，不能使用下标
        * */

        /*
        * HashSet
        * 特点：1.不允许存储重复的元素
        *       2.没有索引，没有带索引的方法。也不能使用带索引的for循环
        *       3.是一个无序的集合，存储元素与取出元素的顺序有可能不一致。
        *       4.底层是一个哈希表结构（查询速度非常快）
        * */
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
        Iterator<Integer> iter1=set.iterator();
        while(iter1.hasNext()) {
            System.out.println(iter1.next());
        }
        for(Integer i:set)
        {
            System.out.println(i);
        }

        /*
        * hash值，是一个十位的整数，由系统随机给出，（就是对象的地址值，是一个逻辑地址，不是实际的地址）
        * hashcode()方法
        * hashcode()的源码：
        *   Public native int hashCode（）
        *   {
        *   }
        * native代表调用系统本地的方法
        *
        * String类的hash值为96354，它重写了hashcode（）方法
        * */
        Person p1=new Person();
        int h1=p1.hashCode();
        System.out.println(h1);  //1867083167
        System.out.println("******************");

        /*HashSet集合存储数据的结构（哈希表）
        * 在jdk1.8版本之后
        * 哈希表=数组+链表
        * 哈希表=数组+红黑树
        * 数组结构讲元素进行了分组，将相同的元素进行分组，
        * 如果链表的长度超过了8个，则将链表转化为红黑树
        *
        * add方法会调用元素的hashcode方法，计算字符串的的哈希值
        * 在集合中没有找到该元素的hash值，如果有则hash冲突
        * */
        HashSet<String> s1=new HashSet<>();
        String str1="abc";
        String str2="abc";
        String str3="种地";
        String str4="通话";
        s1.add(str1);
        s1.add(str2);
        s1.add(str3);
        s1.add(str4);
        System.out.println(s1);

        /*
        * * hash存储自定义类型的元素
        * set集合报错的原因，
        * 必须重写hashcode与equal方法
        *
        *
        * */
        HashSet<第245数组结构.Person> hp=new HashSet<>();
        第245数组结构.Person per1=new 第245数组结构.Person("x",12);
        第245数组结构.Person per2=new 第245数组结构.Person("x",12);
        第245数组结构.Person per3=new 第245数组结构.Person("y",12);
        第245数组结构.Person per4=new 第245数组结构.Person("z",13);
        hp.add(per1);
        hp.add(per2);
        hp.add(per3);
        hp.add(per4);
        System.out.println(hp);

        /*LinkedHashSet
        * 底层是一个hash表（数组+链表/红黑树）+链表，具有可预知迭代顺序的集合
        * 保证元素有序，
        * */
        LinkedList<String> ha1=new LinkedList<>();
        ha1.add("abc");
        ha1.add("edf");
        ha1.add("rrr");
        ha1.add("rgh");
        System.out.println(ha1);//[rgh, abc, rrr, edf]







    }
}
