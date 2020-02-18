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
*
* 使用lambda表达式作为参数传递的好处
* 仅仅是把参数传过去，只有满足条件时，才会调用接口MessageBuild中的方法builderMessage
* 才会进行字符串的拼接
* 如果条件不满足，那么方法不会执行
* */
public class Demo02Logger {
    //根据日志级别显示日志信息
    public  static  void showLog(int level,MessageBuilder mb)
    {
        //对等级进行判断，如果是1级别，那么输出日志信息
        if(level==1)
        {
            System.out.println(mb.buildMessage());
        }
    }

    public static void main(String[] args) {
        String msg1="hello";
        String msg2="world";
        String msg3="java";
        //调用showLog方法，参数Messagebuilder是一个函数式接口
        showLog(1,()->{
            //返回一个拼接好的字符串
            return msg1+msg2+msg3;
        });
    }
}
