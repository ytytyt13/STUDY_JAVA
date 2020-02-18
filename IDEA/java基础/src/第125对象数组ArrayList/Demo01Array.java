package 第125对象数组ArrayList;

/**
 * @author yt13yt
 * @create 2019-11-16 9:12
 */

/**
 * 定义一个数组，用来存放三个Person对象
 * 数组一旦创建，长度不能够改变
 */


public class Demo01Array {
    public static void main(String[] args) {
        //创建一个长度为三的数组
        Person[] p=new Person[3];
        Person one =new Person("迪丽热巴",18);
        Person two =new Person("迪丽热巴",19);
        Person three =new Person("马儿扎哈",20);
        p[0]=one;
        p[1]=two;
        p[2]=three;

        System.out.println(p[0].getName());

    }
}
