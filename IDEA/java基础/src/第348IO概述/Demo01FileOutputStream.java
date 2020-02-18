package 第348IO概述;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author yt13yt
 * @create 2019-12-02 20:13
 */

/*
* java.io
*
*
* 字节输出流：outputStream抽象类，定义了所有都可以用的方法
* public void close();关闭此输出流并释放于此相关的的任何资源
* public void flush();刷新此输出流并强制任何缓冲的输出字节被写出
* public void write(byte[] b);将b.length()字节从指定的字节数组写如此输出流
* public void write(byte[] b,int off,int len);从指定的字节数组写入len字节，从偏移量off开始输出到此输出流
* public abstract void write(int b); 将指定的字节流输出
*
* FlieOutputStream文件字节输出流，把内存中的数据写入到内存中
* 构造方法：
* FileOutputStream(String name)创建一个向具有指定名称的文件中写入数据的输出文件流
* FileOutputStream(File file)创建一个向指定file对象表示的文件中写入数据的文件输入流

* 构造方法的作用：
* 1.创建一个对象
* 2.会根据构造方法中传递的文件/文件路径，创建一个空的文件
* 3.会把FileOutputStream对象指向创建好的文件
*
* 写入数据的原理：
* （内存--》硬盘）
* java程序->jvm->os->调用内核方法
* 字节输出流的使用步骤：
* 1.创建一个FileOutputStream对象，构造方法中写入数据的目的地
* 2.调用write方法，把数据写入到文件
* 3.释放资源close，流的使用会占据内存，要主动清空，提高效率
*
 */
public class Demo01FileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("./a.txt");
        fos.write(97);
        fos.close();

        //一次写多个字节
        FileOutputStream fos1=new FileOutputStream("b.txt");
        //如果写的第一个字节是正数，那么会查询ascII表
        String s="你好啊";
        fos1.write(s.getBytes());
        fos1.write(s.getBytes());
        fos1.write("\n".getBytes()); //换行
        fos1.write(s.getBytes());

        /*数据的追加写与换行写
        * 追加写：
        * 使用两个参数的构造方法：
        * FileOutputStream(String name,boolean append);
        * name:路径名，append追加写开关
        * true创建对象不会覆盖原文件，继续在后面加数据
        * false创建一个新文件，覆盖原文件
        *
        *
        * */

        fos1.close();
    }

}
