package 第402文件上传原理;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @author yt13yt
 * @create 2019-12-04 18:31
 */
/*文件上传的服务器端
*读取客户端上传的文件，保存到服务器端，回写“上传成功”
* 明确，数据源：客户端上传的文件
* 目的地：服务器的硬盘 C:\Users\YT\Documents\2019\201910\java_study\IDEA\result.jpg
*
* 实现步骤
* 1.创建一个服务器对象SocketServer 和系统指定的端口号绑定
* 2.使用ServerSocket对象中的accept，获取到请求的客户端socket对象
* 3.使用Socket对象中的getinputstream获取到网络字节输入流对象
* 4.判断文件夹是否存在，如果不存在则创建一个
* 5，创建一个本地的字节输出流对象fileoutput，构造方法中绑定输出的目的地
* 6。使用网络字节输入流inputStream对象中的read方法，读取客户端上传的文件
* 7.使用本地字节输入流FileOutputStream对象中的write方法，把读取到的文件保存到服务器的硬盘上
* 8.使用Socket对象中的方法outputstream获取到网络字节输出流output stream
* 9.使用网络字节输入流outputStream对象中的write方法，给和客户端回写上传成功
* 10.释放资源
*
* */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8889);

        //让服务器一直处于监听状态，死循环accept
        while(true)
        {
            Socket socket=server.accept();

            /*
            * 使用多线程提高效率；
            * 有一个客户端，则开启一个线程
            *
            * */
            new Thread(new Runnable() {
                @Override
                public void run() {
                    InputStream is= null;
                    try {
                        is = socket.getInputStream();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    File file=new File("C:\\Users\\YT\\Documents\\2019\\201910\\java_study\\IDEA");
                    if(!file.exists())
                    {
                        file.mkdirs();
                    }


                    /*自己定义文件名称
                     * 域名+毫秒值+随机数
                     * */
                    String fileName="yt"+System.currentTimeMillis()+new Random().nextInt(999999)+".jpg";
                    FileOutputStream fos= null;
                    try {
                        fos = new FileOutputStream(file+"\\"+fileName);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                    int len=0;
                    byte[] bytes=new byte[1024];
                    while(true)
                    {
                        try {
                            if (!((len=is.read(bytes))!=-1)) break;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            fos.write(bytes,0,len);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("BBBBBBBBBBBBBBBB");
                    try {
                        socket.getOutputStream().write("上传成功".getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        }

    }
}
