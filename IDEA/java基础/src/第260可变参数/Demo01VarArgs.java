package 第260可变参数;

/**
 * @author yt13yt
 * @create 2019-11-23 21:22
 */

/*
* 可变参数
* jdk1.5之后的新特性
* 当方法的参数列表的数据类型已定，而参数的个数未定可以使用可变参数模板
* 使用格式：
* 修饰符 返回值类型 方法名（数据类型...变量名）
* {
* }
*
* 可变参数原理：
* 课表参数底层是一个数组，根据参数传递的个数不同，创建不同长度的数组来传递来传递这些参数
* 可以传递参数的个数可以是（0，1，2，3）.。多个等
*
* 可变参数的注意事项
* 1.一个方法的列表只能够有一个可变参数
* 2.如果一个方法的参数很多，那么可变参数只能够放在参数列表末尾
* 3.可变参数的特殊写法：
* public viod method (object ...obj)
*
* */
public class Demo01VarArgs {

    public static void main(String[] args) {


    }

    public static int add(int ...n)
    {
        int a=0;
        for(int i:n)
        {
            a=a+i;
        }
        return a;
    }


}
