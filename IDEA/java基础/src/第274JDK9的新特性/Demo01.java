package 第274JDK9的新特性;

import java.util.List;

/**
 * @author yt13yt
 * @create 2019-11-25 17:19
 */

/*
* List,set,map接口加入了一个新的静态方法of，可以给集合一次性添加多个元素
* static<E> list<E> of <E...elements>
* 使用前提：
* 当集合中存储的元素的个数已经确定，不再改变
* 注意事项：
* of方法只适用于list，map，set接口，不适用于接口的实现类
* of方法的返回值是一个不能够改变的集合，集合不能够再使用add，put方法，会抛出异常
* Set接口和Map接口调用of方法时，不能够有重复元素，否则会抛出异常
* */
public class Demo01 {
    public static void main(String[] args) {
        List<String> list=List.of("a","b","c","d");
        System.out.println(list);
        //不再支持list.add()方法
        //Set<String> set=Set.of("s","s","c","b");//不能够有重复元素
    }
}
