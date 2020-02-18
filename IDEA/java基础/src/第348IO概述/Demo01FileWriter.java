package 第348IO概述;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author yt13yt
 * @create 2019-12-03 12:15
 */
/*
* Write类，字符输出流的顶层父类。
* 共性的成员方法：
* void write(int c);
* void write(char[] cbuf);
* close()
*
* 子类FileWriter extends Writer
* 文件字符输出流，吧内存中的字符数据写入到文件中
* 构造方法：
* FileWriter(File file);
* FileWriter(String pathname);
* 作用；
* 1.创建一个filewriter对象
* 2.会根据传递的路径创建一个文件
* 3.将filewriter对象指向该文件
*
*
* 使用步骤：
* 1.创建对象，绑定要写入的目的地
* 2.使用writer把数据写入到缓冲区中
* 3.使用flush方法，把缓冲区中的数据刷新到文件中
* 4.释放资源，会先把缓冲区的数据刷新进入文件
*
* flush与close的区别：
* flush：刷新缓冲区，对象还可以继续使用
* close：先刷新缓冲区，然后通知系统释放资源，流对象不可以使用了
*
*
*
* */
public class Demo01FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("./a.txt");
        fw.write("你好啊\n");
        //fw.flush();
        fw.close();
    }

    /*
    * 字符输出流的其他方法：
    * void write(char[] cbuf) 写入字符数组
    *
    *
    * */
}
