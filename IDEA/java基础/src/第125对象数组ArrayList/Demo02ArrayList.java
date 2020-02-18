package 第125对象数组ArrayList;

import java.util.ArrayList;

/**
 * @author yt13yt
 * @create 2019-11-16 9:33
 */
/*
* 数组长度不能够改变，ArrayList长度可以改变
* ArrarList<E> E泛型,也就是装载在ArrayList里面的对象类型统一
* 泛型只能够是引用类型，不能够是基础类型
* 注意事项：直接打印ArrayList，得到的是内容，如果内容是空，得到是空的中括号
*       String[] strings1 = {"a", "b", "c"};
        // String[] 转 List<String>
        List<String> list3 = Arrays.asList(strings1);
        // List<String> 转 String[]
        String[] strings2 = list3.toArray(new String[0]);

*
*
* */
public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();


        //public boolean add(E e);向集合中添加一些数据，需要用到add方法
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马儿扎哈");
        //list.add(100);   添加内容必须一致
        System.out.println(list);
        //public E get(int index);从集合中获取元素，参数是索引编号，返回对应位子的元素
        //获取元素不能够通过下标获取
        System.out.println(list.get(1));
        //public E remove(int index);删除集合中的一个元素
        list.remove(1);
        System.out.println(list);
        //public int size();获取集合的长度
        System.out.println(list.size());





    }
}
