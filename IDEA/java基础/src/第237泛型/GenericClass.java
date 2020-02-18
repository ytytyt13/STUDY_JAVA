package 第237泛型;

/**
 * @author yt13yt
 * @create 2019-11-18 17:28
 */

/*
* 定义一个含有泛型的类，模拟ArrayList集合
* 泛型是一个未知的数据类型，当我们不确定什么数据类型的时候，可以使用泛型
* 泛型可以接受任何类型的数据，
* 创建对象时要确定泛型的类型
*
*
* */
public class GenericClass<E> {
    private E name;
    public E getName()
    {
        return this.name;
    }
    public void setName(E name)
    {
        this.name=name;
    }
}


