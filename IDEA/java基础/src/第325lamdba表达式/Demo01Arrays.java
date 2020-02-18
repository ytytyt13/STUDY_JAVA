package 第325lamdba表达式;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author yt13yt
 * @create 2019-11-27 21:55
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        Person[] arr={new Person("迪丽热巴",19),
                      new Person("古力娜扎",22),
                      new Person("马儿扎哈",33)};
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge()-o1.getAge();
            }
        });

        //使用lambda表达式
        Arrays.sort(arr,(Person o1,Person o2)->{return o1.getAge()-o2.getAge();});
        for(Person p:arr)
        {
            System.out.println(p);
        }
    }
}
