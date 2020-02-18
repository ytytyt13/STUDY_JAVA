package 第125对象数组ArrayList;

import java.awt.im.InputMethodRequests;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author yt13yt
 * @create 2019-11-16 10:00
 */
/*
* 向集合中存储基本类型必须使用基本类型的包装类型
* byte   Byte
* short  Short
* int    Integer
* long   Long
* float  Float
* double Double
* char   Character
* boolean Boolean
*
* 从jdk1.5 开始支持自动装箱，自动拆箱
* 自动装箱：基本类型-》包装类型
* 自动拆箱：包装类型-》基本类型
* */
public class demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();


        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(100);
        listB.add(200);
        listB.add(300);
        listB.add(400);
        System.out.println(listB);
        int num = listB.get(1);
        System.out.println(num);

        getR();
        student();
        printlist(listB);
        getRandomNum();
    }

    /*练习一
     * 生成六个1-33的随机数字，添加到集合，遍历数组
     * 参数随机数字使用Random方法 Random（33）+1；
     * */
    public static void getR() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(new Random().nextInt(33) + 1);
        }
        System.out.println(list);
    }

    /*
     *习题二
     * 自定义学生对象，加入到集合里面，遍历盖该数组
     * */
    public static void student() {
        ArrayList<Student> stlist = new ArrayList<>();
        Student one = new Student("洪七公", 55);
        Student two = new Student("欧阳锋", 66);
        Student three = new Student("段誉", 40);
        Student four = new Student("乔峰", 34);

        stlist.add(one);
        stlist.add(two);
        stlist.add(three);
        stlist.add(four);

        for (int i = 0; i < 4; i++) {
            System.out.println("name:"+stlist.get(i).getName());
        }
    }


    /*
    * 定义一个方法，打印数组中的元素
    * */

    public static void printlist(ArrayList arr)
    {
        System.out.print("{");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if(i==arr.size()-2)
                break;
            System.out.print("*");
        }
        System.out.println("}");
    }

    /*
    * 集合元素筛选
    * 用一个大集合存入二十个元素，然后采选偶数元素放入小集合
    * */
    public static void getRandomNum()
    {
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arr.add(new Random().nextInt(100));
        }
        System.out.println(arr);
        ArrayList<Integer> doublenum=new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)%2==0)
            {
                doublenum.add(arr.get(i));
            }
        }
        System.out.println(doublenum);
    }
}

