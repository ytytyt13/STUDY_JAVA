package 第261Collection集合工具类;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author yt13yt
 * @create 2019-11-25 13:16
 */
/*
*
*
* */

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println(list);

        /*
        * public static <T>boolean addAll(Collectios<T> c,T...element);往集合中添加元素
        *
        * */
        Collections.addAll(list,"g","h","i");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        /*
        * 默认排序方法
        * public static<T> void sort(List<T> list);将集合中的元素按照默认规则排序
        *
        * 注意事项：
        * 使用前提，被排序的集合里面存储的元素必须重写compareTo()方法
        * */
        Collections.sort(list);
        System.out.println(list);


        ArrayList<Person> list03=new ArrayList<>();
        list03.add(new Person("张三",18));
        list03.add(new Person("李四",19));
        list03.add(new Person("王五",20));
        Collections.sort(list03);
        System.out.println(list03);


        /*
        * public static <T> void sort(list<T>,Comparator<? suoer T>);
        * 将集合中的元素按照规则排序
        *
        * Comparator与Comparable的区别：
        * Comparable自己（this）与别人方法比较，需要重写compareto接口
        *
        * */
        Collections.sort(list03, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

    }
}
