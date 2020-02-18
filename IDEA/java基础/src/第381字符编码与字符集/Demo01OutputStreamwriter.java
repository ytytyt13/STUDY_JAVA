package 第381字符编码与字符集;

import java.io.*;

/**
 * @author yt13yt
 * @create 2019-12-03 20:51
 */

/*
* OutputStreamWriter是字符流通向字节流的桥梁，可以指定编码方法
* 构造方法：
* OutputStreamWriter(OutputStream out);
* OutputStreamWriter(OutputStream out,String charSetName);
*
* out 字节输出流，可以用来写转换之后的自接到文件中
* charSetName 编码表名称 utf-8 gbk/GBK 大小写都可以 不指定，默认使用UTF-8
*
* */
public class Demo01OutputStreamwriter {
    public static void main(String[] args) throws IOException {
       utf_8writer();

    }
    public static void utf_8writer() throws IOException {
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("uft_8.txt"),"utf-8");
        osw.write("你好");
        osw.flush();
        osw.close();
    }
}
