package 第398TCP通信概述;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author yt13yt
 * @create 2019-11-29 20:23
 */

/*
* TCP通信的客户端，向服务器发送数据，读取服务器回写的数据
* 表示客户端的类：
* java.net.Socket次类实现客户端套接字，套接字是两台机器通信的端点
* 套接字：包含了IP地址和端口号的网络单位
* 构造方法：
* Socket(String host,int port) 创建一个套接字并且连接到指定的服务器
* 参数：
* String host 服务器主机名
* int post 服务器端口号
* 成员方法：
* OutputStream getOutputStream() 返回此套接字的输出流
* InputStream getInputStream()返回此套接字的输入流
* void close() 关闭此套接字
*
* 实现步骤
* 1.创建一个客户端对象Sockeet，构造方法绑定服务器的IP地址和端口号
* 2.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream()对象
* 3.使用网络字节输出流OutputStream对象中的write方法，给服务器写数据
* 4.使用Socket对象中的方法getInputStream()获取网络字节输入流对象InputStream对象
* 5.使用InputSteam对象中的方法read，读取服务器回写的数据
* 6，释放资源
* 注意：
* 1
*
* */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8888);

        OutputStream os=socket.getOutputStream();

        os.write("你好！服务器".getBytes());

        InputStream is=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes,0,len));

        socket.close();


    }
}
