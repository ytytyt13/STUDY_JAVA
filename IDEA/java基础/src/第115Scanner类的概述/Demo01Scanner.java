package 第115Scanner类的概述;


import java.util.Scanner;  //1.导包

/**
 * @author yt13yt
 * @create 2019-11-15 12:04
 */
/*
* Scanner类的功能，可以实现键盘输入文字，到程序中
*引用类型的使用步骤
* 1.导包
*   import 包路径.类名字
*   如果需要使用的目标类，和当前类位于同一包下，则可以省略导包语句
*   只有Java.Long包下的内容不需要导报，其他包都需要import语句
* 2.创建
*   类名称 对象名=new 类名称（）；
* 3.使用
*   对象名.成员方法名（）；
*   获取键盘输入的一个int数字，int num=sc.nextInt();
*   获取键盘输入的字符串 String str=sc.next();
* */
public class Demo01Scanner {
    public static void main(String[] args) {
        //String str="123";
        //创建，
        //System.in代表从键盘进行输入
        //Scanner sc=new Scanner(System.in);
        //int num=sc.nextInt();
        //String str=sc.next();
        //System.out.println("输入的数字是"+num+";输入的字符串是:"+str);
        //int addresult=add();
        //System.out.println(addresult);
        int max=getMax();
        System.out.println(max);

    }

    /*
     * 键盘输入两个数字，求其和
     * */
    public static int add()
    {
        System.out.println("input two numbers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        return c;
    }

    /*
    * 键盘输入三个数字，求其最大值
    * */
    public static int getMax()
    {
        System.out.println("input three numbers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int temp=a>b?a:b;
        int max=temp>c?temp:c;
        return max;
    }


}



