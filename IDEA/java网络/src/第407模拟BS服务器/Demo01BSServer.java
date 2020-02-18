package 第407模拟BS服务器;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yt13yt
 * @create 2019-12-04 19:49
 */
/*
* 创建一个BS版本的服务器
*
* */
public class Demo01BSServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8080);

        Socket socket=server.accept();

        InputStream is = socket.getInputStream();
         /*
        byte[] bytes=new byte[1024];
        int len=0;
        while((len=is.read(bytes))!=-1)
        {
            System.out.println(new String(bytes,0,len));
        }
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        //把客户端请求信息第一行读取出来
        String line=br.readLine();
        //读取的信息进行切割
        String[] arr = line.split(" ");
        //截取
        String s = arr[1].substring(1);

        //读取文件
        FileInputStream fis=new FileInputStream(s);
        //使用socket方法

        OutputStream os = socket.getOutputStream();

        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        os.write("\r\n".getBytes());

        //一读一写，复制文件
        int len=0;
        byte[] bytes=new byte[1024];
        while((len=fis.read(bytes))!=-1)
        {
            os.write(bytes,0,len);
        }

        //释放资源
        fis.close();
        socket.close();
        server.close();



    }
}
