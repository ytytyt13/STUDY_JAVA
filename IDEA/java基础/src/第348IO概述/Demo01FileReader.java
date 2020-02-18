package 第348IO概述;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author yt13yt
 * @create 2019-12-03 11:59
 */
/*
* java.io.Reader();
* 用于字符输入流的抽象类，定义了一些共性的成员方法；
* int read() 读取单个字符
* int read(char[] cbuf) 一次读入多个字符至cbuf
* void close()
*
* FileReader类的具体应用：
* 文件字符输入流，
* 作用：把硬盘文件中的数据以字符的方式读入到内存中
*
* 构造方法：
* FileReader(String filename);
* FileReader(File file);
*
* 构造方法的作用：
* 会创建一个filereader的对象
* 把filereader指向文件
*
* 使用步骤：
* 1.创建filereader对象
* 使用read方法读取文件
* close（）释放资源
* */
public class Demo01FileReader
{
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("./read.txt");
        int len=0;
        char[] chars=new char[1024];
        while((len=fr.read(chars))!=-1)
        {
            System.out.println(new String(chars,0,len));
        }
        fr.close();
    }
}
