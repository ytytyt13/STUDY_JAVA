package 第373缓冲流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author yt13yt
 * @create 2019-12-03 19:12
 */
/*
*java.io.BufferedInputStream extends InputStream;
* 字节缓冲输入流
* 继承自父类的成员方法：
*构造方法：
 * BufferedInputStream(InputStream in)
 * 创建一个新的缓冲流，以将数据写入到指定底层的输出流
 *
 * BufferedInputStream(InputStream in,int size)
 * 创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入到指定的底层输出流
 * 参数：
 * OutputStream 字节输出流，
 * 我们可以传递FileOutputStream，缓冲区会增加一个缓冲区
 * int size
 * 指定缓冲区的大小。不指定默认1024
*
* 使用步骤
 * 1.创建FileInputStream对象，构造方法中绑定要输出的目的地
 * 2.创建BufferedInputStream对象，构造方法中传递FileInputStream对象，提高FileInputStream对象的效率
 * 3.使用BUfferedInputStream对象中的Read方法，把数据写入到内存的缓冲区中
 * 4，释放资源
*
* */
public class Demo01BufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("a.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        byte[] bytes=new byte[1024];
        int len=0;
        while((len=bis.read(bytes))!=-1)
        {
            System.out.println(new String(bytes,0,len));
        }
    }
}
