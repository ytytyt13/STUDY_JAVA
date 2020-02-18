package 第373缓冲流;

import java.io.*;

/**
 * @author yt13yt
 * @create 2019-12-03 16:31
 */
/*
* java.io.BufferedStream extends OutputStream
* 字节缓冲输出流
* 继承自父类的共性成员方法
*
* 构造方法：
* BufferedOutputStream(OutputStream out)
* 创建一个新的缓冲流，以将数据写入到指定底层的输出流
*
* BufferedOutputStream(OutputStream out,int size)
* 创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入到指定的底层输出流
* 参数：
* OutputStream 字节输出流，
* 我们可以传递FileOutputStream，缓冲区会增加一个缓冲区
* int size
* 指定缓冲区的大小。不指定默认1024
*
*使用步骤
* 1.创建FileOutputStream对象，构造方法中绑定要输出的目的地
* 2.创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象，提高FileoutputStream对象的效率
* 3.使用BUfferedOutputStream对象中的write方法，把数据写入到内存的缓冲区中
* 4.使用bufferedoutputStream中的flush刷新到文件中
* 5，释放资源
*
* */
public class Demo01bufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("./a.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        bos.write("写入到文件中".getBytes());
        bos.flush();
        fos.close();
        bos.close();
    }
}
