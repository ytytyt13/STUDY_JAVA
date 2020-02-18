package 第243斗地主案例;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author yt13yt
 * @create 2019-11-18 20:27
 */

/*
* 1准备牌
* 2洗牌
* 3发牌
* 4看牌
*
*
* */
public class doudizhu {
    public static void main(String[] args) {
        //准备牌，
        //定义一个存储54张牌的ArrayList集合，泛型使用String
        ArrayList<String> puke=new ArrayList<>();
        //定义两个数组，一个牌色，一个牌号
        String[] colors={"♥","♠","♦","♣"};
        String[] nums={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        //先把大王小王放到扑克中
        puke.add("大王");
        puke.add("小王");
        //循环嵌套遍历两个数组，组装52张牌
        for(String number:nums)
        {
            for(String color:colors)
            {
                puke.add(color+number);
            }
        }

        //洗牌。使用集合的工具类suffle（）方法
        Collections.shuffle(puke);

        //发牌
        //定义四个集合用来代表玩家
        ArrayList<String> player01=new ArrayList<>();
        ArrayList<String> player02=new ArrayList<>();
        ArrayList<String> player03=new ArrayList<>();
        ArrayList<String> 底牌=new ArrayList<>();

        for (int i = 0; i <puke.size() ; i++) {
            if(i<51)
            {
                if(i%3==0)
                {
                    player01.add(puke.get(i));
                }else if(i%3==1)
                {
                    player02.add(puke.get(i));
                }else if(i%3==2)
                {
                    player03.add(puke.get(i));
                }
            }else
            {
                底牌.add(puke.get(i));
            }

        }
        System.out.println(player01);
        System.out.println(player02);
        System.out.println(player03);
        System.out.println(底牌);

    }
}
