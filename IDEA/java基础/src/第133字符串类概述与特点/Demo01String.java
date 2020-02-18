package 第133字符串类概述与特点;

/**
 * @author yt13yt
 * @create 2019-11-16 15:28
 */

/*
* java.long.String
* 程序种所有的双引号字符串，都是String类型的文档（就算没有new操作符）
* 字符串的特点：
* 1.字符串的内容是常量，永远不可以改变【重点】
* 2.正是因为字符串不可以改变，所以字符串可以共享使用
* 3.字符串效果上相当于char[]字符数组，底层原理是byte[]字节数组
*
*
* 字符串的创建方法，3+1种方式
* 三种构造方法，一种直接创建
* public String();创建一个空白字符串，不含有任何内容
* public String(char[] array);根据字符数组的内容，来创建对应的字符串
* public String(byte[] array);根据字节数组的类容，创建对应的字符串
* 一种直接创建
* */
public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String str1=new String();
        System.out.println(str1);

        //根据字符数组创建字符串
        char[] charArray={'z','x','c'} ;
        String str2=new String(charArray);
        System.out.println(str2);

        //根据字节数组创建字符串
        byte[] byteArray={97,96,95};
        String str3=new String(byteArray);
        System.out.println(str3);

        //直接创建
        String str4="abcaefghijklmnopqrstvuwxyz";
        String str5="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }
}
