package 第224Systm类;

import java.util.Arrays;

/**
 * @author yt13yt
 * @create 2019-11-18 12:36
 */

/*
* java.long.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，常用方法如下：
* public static long currentTimeMillis();返回以毫秒为单位的当前时间
* public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length);将数组中指定的数据拷贝到另一个数组中
* src原数组
* srcPos 原数组中的起始位置
* dest 目标数组
* destPos 目标数组中的起始位置
* length 要复制数组元素的数量
* */
public class Demo01System {
    public static void main(String[] args) {
        long beginTime=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-beginTime);



        /*
        * 数组复制方法
        * */
        int[] src={1,2,3,4,5};
        int[] dest={6,7,8,9,10};
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(dest));

    }

}
