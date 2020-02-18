package 第121random概述;

/**
 * @author yt13yt
 * @create 2019-11-15 20:11
 */

import java.util.Random;
import java.util.Scanner;

/**
 *Random类用来生成随机数字，使用起来也是三个步骤：
 * 1.导包
 * import java.util.Random
 * 2.创建
 * Random r=new Random();
 * 3.使用
 * 获取一个随机整型（int）数字
 * r.nextInt();  //获取所有范围，有正负两种
 * r.nextInt(int range);  //参数代表范围，左闭右开区间[0,range)
 */

public class Demo01Random {
    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt();
        System.out.println("随机数是："+num);  //-800395966

        for (int i = 0; i < 100; i++) {
            int num1=r.nextInt(5);
            System.out.println(num1);
        }

        for (int i = 0; i < 100; i++) {
            int num2=getRandom(10);
            System.out.println(num2);
        }

        randomGame();
    }
    
    /*
    * 产生随机变量[1,n]之间的整数
    * 整体加一即可
    * */
    public static int getRandom(int num)
    {
        int numResult= new Random().nextInt(num);
        return numResult+1;
    }


    /*
    * 猜数字小游戏
    * 思路：产生一个随机数字，一旦产生就不能够改变，用random方法
    *       需要键盘输入，使用Scanner类输入
    *       判断输入的数字与随机数字的比较结果
    *       如果太大，提示太大，并且重试
    *       如果太小，提示太小，并且重试
    *       如果猜中，游戏结束
    * 重试就是再来一次，循环
    * */

    public static void randomGame()
    {
        Random r= new Random();
        int randomNum=r.nextInt(100)+1; //[1:100]
        Scanner sc=new Scanner(System.in);
        System.out.println("randomNum:"+randomNum);

        while(true)
        {
            System.out.println("请输入你的数字：");
            int guessNum=sc.nextInt();
            if (randomNum<guessNum) {
                System.out.println("太大了，请重试");
            }else if (randomNum>guessNum) {
                System.out.println("太小了，请重试");
            } else {
                System.out.println("恭喜你，答对了");
                break;
            }
        }
        System.out.println("游戏结束");
    }

}
