package 第119匿名对象的说明;

import java.util.Scanner;

/**
 * @author yt13yt
 * @create 2019-11-15 19:59
 */
public class Demo02Anonymous {
    public static void main(String[] args) {
        //普通使用方式
        //Scanner sc=new Scanner(System.in);
        //int num=sc.nextInt();
        //匿名对象模式
        int num1 = new Scanner(System.in).nextInt();

        //使用一般写法传递参数
        Scanner sc = new Scanner(System.in);
        methodParam(sc);

        //使用匿名对象传递参数
        methodParam(new Scanner(System.in));

        Scanner a = methodParam1();
        int num2=a.nextInt();

    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static Scanner methodParam1()
    {
        return new Scanner(System.in);
    }

}
