package 第398TCP通信概述;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yt13yt
 * @create 2019-11-29 21:03
 */
/*
* TCP通信的服务器端，接收客户端的数据，回写数据
* Java.net.ServerSocket
* 构造方法：
*   ServerSocket(int port);
*指定端口号
* 必须明确一件事情，必须知道是哪个客户端请求的服务器，
* 必须调用accept方法获取到请求的客户端的socket对象
* 成员方法：
* Socket accept() 侦听并接受到此套接字的链接
*
* 服务器的实现步骤
* 1.创建服务器ServerSocket对象和系统要指定的端口
* 2。使用ServerSocket对象中的accept（）方法获取到请求客户端对象的Socket
*3.使用Socket对象中的方法getInputStream()获取网络字节输出流InputStream()对象
 * 4.使用网络字节输出流InputStream对象中的read方法，给服务器写数据
 * 5.使用Socket对象中的方法getOutStream()获取网络字节输入流对象OutputStream对象
 * 6.使用OutputSteam对象中的方法write，读取服务器回写的数据
 * 7.释放对象
* */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8889);
        Socket socket=server.accept();
        InputStream is=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes,0,len));
        OutputStream os=socket.getOutputStream();
        os.write("收到谢谢".getBytes());
        socket.close();
        server.close();

    }
}
