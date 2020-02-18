package 第381字符编码与字符集;

import java.io.*;

/**
 * @author yt13yt
 * @create 2019-12-03 21:03
 */

/*
* 按照编码表读取字节，解码
* * 构造方法：
 * InputStreamWriter(InputStream out);
 * InputStreamWriter(InputStream out,String charSetName);
 *
 * out 字节输出流，可以用来写转换之后的自接到文件中
 * charSetName 编码表名称 utf-8 gbk/GBK 大小写都可以 不指定，默认使用UTF-8
*
* 1.使用步骤：
* 创建InputStreamReader，构造方法指定传递的字符文件与编码表
*
* */
public class DEmo01InputStreamReader {
    public static void main(String[] args) throws IOException {
        read_utf8();
    }

    public static void read_utf8() throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("./a.txt"), "utf-8");
        int len=0;
        while((len=isr.read())!=-1)
        {
            System.out.println((char)len);
        }
        isr.close();


    }
}
