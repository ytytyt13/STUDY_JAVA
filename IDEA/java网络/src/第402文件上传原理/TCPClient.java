package 第402文件上传原理;

import java.io.*;
import java.net.Socket;

/**
 * @author yt13yt
 * @create 2019-12-04 18:13
 */
/*
* 文件上传的客户端
* 读取本地文件，然后上传，读取回写的数据
* 明确：
* 数据源：C:\\Users\\YT\\Documents\\2019\\201910\\java_study\\IDEA\\test.jpg
*目的地：服务器
* 实现步骤：
* 1.读取本地文件，创建本地的字节输入流FileInputStream,构造方法中绑定要读取的文件路径
* 2.创建一个客户端的SOcket对象，构造方法中绑定IP地址与端口号
* 3.使用Socket方法中的个体OutputStream获取网络字节输出流OutputStraem对象
* 4.使用本地字节输出流FileInputStream对象中的方法read()读取本地文件
* 5.使用网络的输出流OutputStream中的write方法，把文件上传到服务器上面
* 6.适应Socket中的getInputStream,获取网络字节输入流InputStream对象
* 7.使用read方法，读取回写的数据
* 8。释放资源（FileInputStream Socket）
* */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\YT\\Documents\\2019\\201910\\java_study\\IDEA\\test.jpg");
        Socket socket=new Socket("127.0.0.1",8889);
        OutputStream os=socket.getOutputStream();
        int len=0;
        byte[] bytes=new byte[1024];

        while((len=fis.read(bytes))!=-1)
        {
            os.write(bytes,0,len);
        }
//写结束标记void shutDownOutput();
        socket.shutdownOutput();

        InputStream is=socket.getInputStream();
        while((len=is.read(bytes))!=-1)
        {
           System.out.println(new String(bytes,0,len));
        }

        fis.close();
        socket.close();

    }
}
