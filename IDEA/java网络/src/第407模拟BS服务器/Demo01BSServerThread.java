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
public class Demo01BSServerThread {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8080);
        /*
        * 浏览器解析服务器回写的html界面，页面中如果有图片，那么浏览器就会单独的开启一个线程
        * 让其读取服务器的图片，
        * 我们就让服务器一直处于监听状态
        * */

        while(true)
        {
            Socket socket=server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
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
                        System.out.println(line);
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
                    }catch (IOException e)
                    {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
