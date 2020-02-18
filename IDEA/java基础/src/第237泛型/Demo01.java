package 第237泛型;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author yt13yt
 * @create 2019-11-18 17:03
 */

/*
* 泛型是一种未知的数据类型，泛型可以看成是一个变量，用来接收数据类型；
* E e：element
* T t :type
* ArrayList集合在定义的时候，不知道集合中存储什么类型的数据，所以存储也是泛型
*
* public class ArrayList<E>
  {
  * public boolean add(E e){};
  * public E get(int index){};
* }
* E 代表未知的类型，类型的确定在创建集合对象时；
* */
public class Demo01 {
    public static void main(String[] args) {
        show01();
        show02();


        //泛型指明类型
        GenericClass<String> gc=new GenericClass<String>();
        gc.setName("只能够是字符串");
        System.out.println(gc.getName());

        //泛型不指明类型，默认为Object类型
        GenericClass gc1=new GenericClass();
        gc.setName("kaka");
        System.out.println(gc.getName());

        GenericMethod gm=new GenericMethod();
        gm.method01(10);
        gm.method01("abc");

        GenericMethod.method02("fff");

        GenericInterfaceImpl1 gi=new GenericInterfaceImpl1();
        gi.method("sss");

        GenericInterfaceImpl2<Integer> gi2=new GenericInterfaceImpl2<Integer>();
        gi2.method(10);


    }

    /*
    *创建集合对象，不使用泛型，
    * 好处：
    * 集合不使用泛型，默认类型就是Object类型，可以存储任意类型的数据
    * 弊端：
    * 不安全，会引发异常
    *
    * */
    public static void show01()
    {
        ArrayList list=new ArrayList();
        list.add(1);
        list.add("a");
        Iterator iter=list.iterator();
        while(iter.hasNext())
        {
            Object ob=iter.next();
            System.out.println(ob);
            //使用String特有的方法length（）获取长度
            //需要向下转型
            //String s=(String) ob;
            //System.out.println(s.length());
        }

    }


    /*
    * 创建集合对象使用泛型
    * 好处：
    * 1.避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
    * 2，把运行期的异常提示到编译期
    * 弊端：
    * 反省是什么类型，只能够存储什么类型
    * */
    public static void show02()
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("haha");
        list.add("lala");
        list.add("xixi");
        //list.add(1);
        Iterator<String> iter =list.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }

    }
}
