package 第119匿名对象的说明;

import 第119匿名对象的说明.Person;

/**
 * @author yt13yt
 * @create 2019-11-15 19:35
 */

/*
* 创建对象的标准格式
* 类名称 对象名=new 类名称();
*
* 匿名对象就是只有右边的对象，没有左边的对象名字和赋值运算符
* new 类名称()；
* 注意事项：匿名对象只能够使用唯一的一次，下次再用不得不在创建一个对象
* 建议使用：如果确定有一个对象只使用一次，就可以使用该匿名对象
* */
public class Demo01Anonymous {

    public static void main(String[] args) {
        Person one=new Person();
        one.name="包振宇";
        one.show();           //包振宇
        new Person().show();  //null
    }
}
