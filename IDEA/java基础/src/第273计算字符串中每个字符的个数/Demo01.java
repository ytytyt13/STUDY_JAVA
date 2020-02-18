package 第273计算字符串中每个字符的个数;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author yt13yt
 * @create 2019-11-25 17:09
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        HashMap<Character,Integer> mp=new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            Character ch=str.charAt(i);
            if(!mp.containsKey(ch))
            {
                mp.put(ch,1);
            }else {
                Integer v = mp.get(ch);
                v++;
                mp.put(ch, v);
            }
        }
        System.out.println(mp);
    }
}
