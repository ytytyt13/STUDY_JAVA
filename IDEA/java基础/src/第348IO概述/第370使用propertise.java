package 第348IO概述;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author yt13yt
 * @create 2019-12-03 15:02
 */

/*
* 属性集
* java.util.Properties集合 extends Hashtable<K,V>;
* Properties类表示一个持久的属性集合，Properties可以保存在流中，或者从流中加载
* Properties集合是唯一一个与IO流相结合的集合
*
* 属性列表中每一个键及其对应值都是一个字符串
* 可以使用Properties中的方法
* load()把硬盘中的键值对写入到内存中
* store()将集合中的临时数据写入到硬盘中
*
* Properties
*
*
* */
public class 第370使用propertise {
    public static void main(String[] args) throws IOException {
        show01();
        show02();
    }

    /*
    * 使用Properties集合存储数据，遍历取出Properties集合中的数据，
    * Properties集合是一个双列集合，key与value都是字符串
    * Properties集合有一些操作字符串的特有方法
    * Object setProperty(String key,String value)调用Hashtable的方法put
    *        getProperty(String key);通过key找到value，相当于map中的get方法
    *        String[] StringPropertyNames();返回所有的键值
    *
    * */
    public static void show01()
    {
        //创建properties对象
        Properties prop=new Properties();
        prop.setProperty("a","1");
        prop.setProperty("b","2");
        prop.setProperty("c","2");

        //使用StringPropertyNames把properties集合中的键取出
        Set<String> set=prop.stringPropertyNames();
        //遍剑指
        for (String s : set) {
            String str=prop.getProperty(s);
            System.out.println(s+"+"+str);
        }
    }

    /*
    * void store(OutputStream out，String comments)方法
    * 参数：
    * out 字节输出流，
    * comments 注释，用来解释保存的文件的作用
    * 不能够使用中文
    * void store(Writer writer,String comments)方法
    *
    * 使用步骤：
    * 1.创建prperties集合对象添加数据
    * 2.创建字节流对象，构造方法中绑定要输出的目的地
    * 3.使用store方法，将数据写入到硬盘中
    * 4.释放资源
    * */

    public static void show02() throws IOException {
        Properties prop=new Properties();
        prop.setProperty("a","1");
        prop.setProperty("b","2");
        prop.setProperty("c","2");

        FileWriter fw=new FileWriter("c.txt");
        prop.store(fw," ");
        prop.clone();


    }

    /*
    * load方法
    * 把硬盘中的文件读取到集合中使用，
    * void load(InoutStream inStream);
    * void load(Reader reader);
    * 参数：
    * 输入字节流
    * 使用方法：
    * 1，创建一个properties对象
    * 2.使用load的方法load读取保存键值对的文件
    * 3.遍历properties集合
    * 注意：
    * 1.存储键值对的文件中，键与值默认的链接符号使用=，空格
    * 2.存储键值对的文件中，可以使用#号进行注释，被注释掉的数据不会再被读取
    * 3.存储键值对的文件中，键与值默认都是字符串，不用再加引号
    * */
    public static void show03() throws IOException {
        Properties prop=new Properties();
        prop.load(new FileReader("./c.txt"));
        Set<String> strings = prop.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string+","+prop.getProperty(string));
        }
    }
}
