package 第133字符串类概述与特点;

import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

/**
 * @author yt13yt
 * @create 2019-11-16 15:46
 */

/*
* 字符串常量池，程序中直接写上的双引号字符串，就在字符串常量池中
*
* 对于基本引用类型：==是进行数值比较
* 对于引用类型来说，==时进行【地址值】的比较
*
* */
public class Demo02String {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";

        System.out.println(str1==str2);
        char[] charArray={'a','b','c'};
        String str3=new String(charArray);
        String str4="abcdefghijklmnopqrstuvwxyz";
        String str5="abcdefghijklmnopqrstuvwxyz";
        stringEquals();

        getWayDemo();
        getWayDemo2();
        getWayDemo3();
        getWayDemo4();
        fromArrayToString();


    }

    //字符串当中的常用方法：
    /*1.字符串类容值得比较
    public boolean equals(Object obj);
    参数可以是任何对象，只有参数是一个字符串并且相同时才会返回true；否则返回false
    备注：任何对象都能够用object对象接收
    注意事项：equals方法具有对称性 a.equals(b)等价于b.equals(a);
    如果比较双方一个常量一个变量那么推荐把常量字符串写在前面
    String s="abc";
    "abc".equals(s);   //推荐


    2.public boolean equalsIgnoreCase(String str);忽略大小写，进行内容比较
    */

    public static void stringEquals()
    {
        String str1="hello";
        String str2="hello";
        char[] charArray={'h','e','l','l','o'};
        String str3=new String(charArray);
        boolean res=str1.equals(str2);
        System.out.println(res);

        System.out.println(str2.equals(str3));
        System.out.println(str2.equals("hello"));


        String a="java";
        String b="Java";
        System.out.println(a.equals(b));   //false
        System.out.println(a.equalsIgnoreCase(b)); //true
    }


    /*
    * 与获取相关的方法
    * 1.public int length();获取字符串长度
    * 2.public String concat(String s);将当前字符串和参数字符串进行拼接成为新的字符串
    * 3.public char charAt(int index);获取索引位置得单字符串
    * 4.public int indexOf(String str);查找参数字符串在本字符串中首次出现的位置,没有-1
    * */

    public static void getWayDemo()
    {
        String str1="hello";
        String str2="world";

        System.out.println(str1.length());
        System.out.println(str1.concat(str2));
        System.out.println(str1.charAt(1));
        System.out.println(str1.indexOf("el"));
    }


    /*
    * 字符串中的截取方法
    * public String substring(int index);//从参数位置一直到字符串结尾，返回该字符串
    * public String subString(int begin,int end);截取从begin开始，到end结束，中间的字符串
    * [begin,end)包含左边，不包含右边；
    * */

    public static void getWayDemo2()
    {
        String str1="helloworld";
        System.out.println(str1.substring(5));
        System.out.println(str1.substring(5,6));
    }

    /*
    * 与转换相关的方法
    * public char[] toCharArray();将当前字符串拆分成字符数组作为返回值
    * public byte[] getBytes();获得了当前字符串底层的字节数组
    * public String replace(charSequence oldString,cahrSeuqence newString);将所有出现老字符串的
    * 替换成为新的字符串，返回替换之后的结果新字符串
    * charSequence代表可以接收字符数组
    * */
    public static void getWayDemo3()
    {
        String str1="aaabaaabbaaaabbbaaaa";
        System.out.println(str1.replace("b","a"));
    }


    /*
    * 字符串的分割方法
    * public String[] split(String regex);//按照参数规则分割字符串
    *split的参数是一个正则表达式；如果按照英文句点进行切分，必须使用\\.
    * */
    public static void getWayDemo4()
    {
        String str4="aaa,bbb.ccc.ddd";
        String[] str=str4.split("\\,");
        for (int i = 0; i < str.length;i++) {
            System.out.println(str[i]);
        }
    }
    
    /*
    * 联系一：
    * 并且字符串。格式为[word#word#word];
    * */
    public static void fromArrayToString()
    {
        String[] str=new String[3];
        for (int i = 0; i < 3; i++) {
            Scanner sc=new Scanner(System.in);
            str[i]=sc.next();
        }
        String resultString="[";
        for (int i = 0; i < 3; i++) {
            if(i==2)
            {
                resultString=resultString+str[i];
                break;
            }
            resultString=resultString+str[i]+"#";
        }
        resultString=resultString+"]";
        System.out.println(resultString);
        
        
    }
}
