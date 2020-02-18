package 第261Collection集合工具类;

import java.util.Objects;

/**
 * @author yt13yt
 * @create 2019-11-23 20:58
 */
public class Person implements Comparable<Person>{
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

    public String toString()
    {
        return "Person{"+"name:"+name+"\'"
                +"age:"+age+"}";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public int compareTo(Person o) {
        //自定义比较的规则
        //一个是this，一个是传进来的参数o
        return -(this.getAge()-o.getAge());

        //return 0;  //认为元素的都是相同的
    }
}
