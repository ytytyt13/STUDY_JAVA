package 第411性能日志;

/**
 * @author yt13yt
 * @create 2019-12-05 18:39
 */
/*
* 日志案例
* 发现一下代码存在一些性能浪费问题
* 调用showLog方法，传递的第二个参数是一个拼接后的字符串
* 先把字符串拼接好，然后再调用showLog方法，
* 如果传递的等级不是1，那么拼接就浪费了
*
* */
public class Demo01Logger {
    //根据日志级别显示日志信息
    public  static  void showLog(int level,String message)
    {
        //对等级进行判断，如果是1级别，那么输出日志信息
        if(level==1)
        {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String msg1="hello";
        String msg2="world";
        String msg3="java";
        //调用showLog方法，传递日志级别和日志信息
        showLog(1,msg1+msg2+msg3);
    }
}
