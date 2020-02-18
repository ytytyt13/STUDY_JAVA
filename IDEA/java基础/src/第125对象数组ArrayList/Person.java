package 第125对象数组ArrayList;

/**
 * @author yt13yt
 * @create 2019-11-16 9:14
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
}
