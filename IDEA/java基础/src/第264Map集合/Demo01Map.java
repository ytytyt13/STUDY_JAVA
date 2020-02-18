package 第264Map集合;

import java.util.*;

/**
 * @author yt13yt
 * @create 2019-11-25 14:19
 */
/*
 *java.util.Map<K,V>集合
 * 集合特点：
 * Map集合是一个双列集合，一个元素包含两个值，（一个key，一个value）
 * Map集合中的元素，key与value可以是不同的类型
 * Map集合中的元素，key不能够重复，value可以重复
 * HashMap由key和value组成，
 * 1.HashMap集合的底层是由哈希表构成，查询的速度特别的快
 * 2.HashMap是一个无序的集合
 * LinkedHashMap
 * 1.extends HashMap
 * 特点：
 * 1，LinkedHashMap底层是hash表加链表，能够保证元素有序
 *
 *
 */


public class Demo01Map {
    public static void main(String[] args) {
        /*
        * 1.put（Key，value）方法，往集合中添加元素
        * 2.get(Key)
        * 3.remove(key)
        * 4.containKey(key)
        * 5.keySet()
        * 6.entrySet()
        * */
        show08();
    }

    /*
    * public v put(K key,V value)把指定key与value的元素添加到map之中
    * 返回值：存储的key不重复，返回的是null
    *        存储的key重复，会使用新的value替换原来的value，并且返回该value
    *
    * */
    private static void show01()
    {
        HashMap<String,String> map=new HashMap<>();
        map.put("李晨","范冰冰");
        System.out.println(map);
        map.put("李晨","范冰冰2");
        System.out.println(map);
        map.put("冷锋","龙小云");
        map.put("杨过","小龙女");
        map.put("文章","马伊琍");
    }

    /*
    * public V remove(Object obj)把指定键所对应的元素在map集合中删除，返回被删除元素的值
    * 返回值：
    * key存在，v返回被删除元素的值
    * key不存在，v返回null
    * */
    public static void show02()
    {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",178);
        map.put("范冰冰",165);
        map.put("林志玲",177);
        map.remove("林志玲");
        System.out.println(map);
    }

    /*
    * public get(K key);通过key获取value
    * 如果key存在，返回对应的value
    * 如果key不存在，返回null
    * */
    public static void show03()
    {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",178);
        map.put("范冰冰",165);
        map.put("林志玲",177);
        System.out.println(map.get("林志玲"));
    }

    /*
    * public <T> boolean containKey(Object key);
    * key存在，返回true
    * key不存在，返回false
    * */


    /*
    * 遍历map集合
    * Set<K> keySet()
    * */

    public static void show04()
    {
        //Map集合的第一种遍历方式。键找值
        //实现步骤：
        //1.使用Map集合中的方法KeySet，把集合中的所有key找出来，存储到一个set集合中
        //2.遍历set集合，获取map集合中的每一个key
        //3.通过集合中的get（Key）方法找到value
        HashMap<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",178);
        map.put("范冰冰",165);
        map.put("林志玲",177);
        Set<String> s=map.keySet();
        Iterator<String> iter=s.iterator();
        while(iter.hasNext())
        {
            String key=iter.next();
            System.out.println(map.get(key));

        }

    }

    /*
    * Entry对象
    * Map.Entry(K,V)//在map接口内部中有一个内部接口entry
    * 作用：当Map集合一创建，那么就会在Map集合中创建一个entry对象，用来记录键与值
    * 键值对对象，键与值的映射关系
    * Map.Entry me=map.entrySet();
    * me.getKey();
    * me.getValue();
    * */
    public static void show05()
    {
        //Map集合的第一种遍历方式。键找值
        //实现步骤：
        //1.使用map集合中的entrySet（）方法，把map集合中的多个entry对象取出来,存储在一个set集合中
        //2.遍历set集合，获取每一个entry对象
        //3.使用entry中的方法getkkey与getvalue方法获得键与值
        HashMap<String,Integer> map=new HashMap<>();
        map.put("赵丽颖",178);
        map.put("范冰冰",165);
        map.put("林志玲",177);
        Set<Map.Entry<String,Integer>> me=map.entrySet();
        Iterator<Map.Entry<String,Integer>> iter=me.iterator();
        while(iter.hasNext())
        {
            Map.Entry<String,Integer> entry=iter.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    /*
    * 使用hashmap存储自定义类型的元素
    *
    * */
    public static void show06()
    {

        HashMap<String,Person> map=new HashMap<>();
        map.put("赵",new Person("赵",18));
        map.put("钱",new Person("钱",19));
        map.put("孙",new Person("孙",20));
        map.put("李",new Person("李",21));

        Set<String> set=map.keySet();
        for(String key:set)
        {
            Person value=map.get(key);
            System.out.println(value.getAge());
        }
    }

    /*
    * LinkedHashMap继承了HashMap
    * 具有可预知的迭代顺序，
    * 底层原理：
    * 哈希表+链表
    *
    * */

    public static void show07()
    {
        HashMap<String,String> map=new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        map.put("d","d");
        map.put("c","c");

        System.out.println(map);

        LinkedHashMap<String,String> map1=new LinkedHashMap<>();
        map1.put("a","A");
        map1.put("b","B");
        map1.put("d","D");
        map1.put("c","C");

        System.out.println(map1);

    }

    /*
    * Map接口的另外一个实现HashTable
    * HashTable<K,V> implements Map<K,V>;
    * hashtable底层是一个哈希表，是一个线程安全的集合，是单线程的集合，速度慢
    * hashMap底层是一个哈希表，是一个线程不安全的集合，多线程的集合，速度快
    *
    * hashmap集合可以存储null值，null键
    * hashtable集合不能够存储null值，null键
    *
    * hashtable和vector后来被hashmap与arraylist集合替代
    *
    * hashtable的子类properties依然活跃在历史的舞台。
    * properties集合是唯一一个和IO流相结合的集合
    * */
    public static void show08()
    {
        HashMap<String,String> map=new HashMap<>();
        map.put("a","a");
        map.put(null,"b");
        map.put("d",null);
        map.put("c","c");
        System.out.println(map);

        Hashtable<String,String> map1=new Hashtable<>();
        map1.put("a","A");
        map1.put(null,null);
        map1.put("d","D");
        map1.put("c","C");

        System.out.println(map1);

    }

}
