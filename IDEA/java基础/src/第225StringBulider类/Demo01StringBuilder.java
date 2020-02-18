package 第225StringBulider类;

/**
 * @author yt13yt
 * @create 2019-11-18 12:54
 */


/*
* String类
* 字符串是常量，他的值在创建之后不能够被改变。
* 进行字符串的相加，内存中就会有多个字符串，占用空间多，效率低下
* String s="a"+"b"+"c";
*         ab+c
*         abc
* Stringbuilder类，字符串缓冲区，可以提高字符串的操作效率，可以看成是长度可以变化的数组，没有被final修饰
* a+b+c;
* StringBuilder类可以自动扩容，初始长度为16
*
* 构造方法：
* StringBuilder();构造一个不带任何参数的字符串生成器，其初始化容量为16个字符
* StringBuilder(String str);构造一个字符串生成器，其初始化内容为str

* 常见方法：
* append(String str);  添加任何类型的数据
* StringBuilder bu=new StringBuilder();
* StringBuilder bu2=bu.append("abc");
*
* bu与bu2的地址值相同
*
*
* StringBuilder与String可以相互转换，
* String->StringBuilder ;可以使用string builder的构造方法；
* StringBuilder->String ;可以使用toString（）方法；
 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        StringBuilder s1=new StringBuilder();
        System.out.println(s1);

        StringBuilder s2=new StringBuilder("abc");
        System.out.println(s2);

        s1.append("ss");
        s1.append(123);
        s1.append("中国").append("湖北").append("武汉");
        System.out.println(s1);

        String str="hello";
        System.out.println(str);
        StringBuilder sb=new StringBuilder(str);
        sb.append("world");
        str=sb.toString();
        System.out.println(str);
        str="abcdefghijklmnipqrstuvwxyz";
        str="abcdefghijklmnopqrstuvwxyz";
    }

}
