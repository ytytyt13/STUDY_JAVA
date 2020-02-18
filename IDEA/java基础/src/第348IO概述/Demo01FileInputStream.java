package 第348IO概述;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author yt13yt
 * @create 2019-12-02 21:17
 */
/*
* 字节输入流
* java.io.InputStream
*
* 方法：
* int read()  一次读取一个字节
* int read(byte[] b) 一次读取一串字节流   从输入流中读取一定数量的字节数，并将其存储在缓冲区数组b中
* close()
* 作用：把硬盘中的数据读取到内存
* 构造方法：
* FileInputStream(String name)
* FileInputStream(File file)
* 参数读取文件的数据源
*
* 构造方法的作用：
* 1.会创建一个FileInputStream对象
* 2.会把FileInputStream对象指定构造方法中要读取的对象
*
* 字节输入流的使用步骤：
* 1。创建对象，构造方法中绑定要读取的数据源
* 2.调用read读取文件
* 3。close，释放资源
*
* String类的构造方法
* String(byte[] bytes)  把字节数组转换为字符串
* String(byte[] bytes,int offest,int length)把字节数组的一部分转换为字符串
* */
public class Demo01FileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("./read.txt");
        int s=fis.read();
        //System.out.println(s);


        while(s>0)
        {
            System.out.println(s);
            s=fis.read();
        }
        fis.close();


    FileInputStream fis1=new FileInputStream("./read.txt");
    byte[] bytes=new byte[100];
    int len1=0;
    while((len1=fis1.read(bytes))!=-1) {
        System.out.println(len1);
        System.out.println(new String(bytes,0,len1));
    }
    fis1.close();
    }


}
