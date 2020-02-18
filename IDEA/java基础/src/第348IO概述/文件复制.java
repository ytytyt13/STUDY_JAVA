package 第348IO概述;

import java.io.*;

/**
 * @author yt13yt
 * @create 2019-12-02 22:13
 */
/*
* 文件的复制
* 要复制的数据源
*
* */
public class 文件复制 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("./icon_1.jpg");
        FileOutputStream fos=new FileOutputStream("./icon_2.jpg");
        int len=0;
        byte[] bytes=new byte[1024];
        while((len=fis.read())!=-1)
        {
            fos.write(len);
        }

        //先关写再关读
        fos.close();
        fis.close();


    }
}
