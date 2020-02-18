package 第275Debug最终;

/**
 * @author yt13yt
 * @create 2019-11-25 17:31
 */
/*
* Debug调试程序，可以让代码逐行执行，可以调试程序中出现的错误
* 使用方法：
* 在行号右边，鼠标左击，添加断点
* 右键，选择debug执行程序
* 程序就会停留在添加的第一个断点处
* 执行程序
* f8：逐行执行程序
* f7：进入到方法中
* f8+shift：跳出方法
* f9：跳到下一个断点
* ctrl+f2 退出debug
* console：切换控制台
*
* */

public class Demo01 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        System.out.println(a);
    }

}
