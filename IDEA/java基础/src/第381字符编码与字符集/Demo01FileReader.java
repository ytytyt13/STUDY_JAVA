package 第381字符编码与字符集;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author yt13yt
 * @create 2019-12-03 20:29
 */

/*
* FileReader可以读取IDEA默认的编码格式(utf-8)的文件
* FileRead读取默认编码（GBK）
*
* */
public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("./我是GBK的文件.txt");
        int  len=0;
        while((len=fr.read())!=-1)
            System.out.println((char) len);
        fr.close();

    }
}
