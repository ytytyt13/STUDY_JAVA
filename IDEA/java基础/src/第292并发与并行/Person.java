package 第292并发与并行;

/**
 * @author yt13yt
 * @create 2019-11-25 19:46
 */
public class Person {
    private  String name;

    public void run()
    {
        //定义循环
        for (int i = 0; i < 20; i++) {
            System.out.println("name:"+this.name+",num:"+i);
        }
    }
    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
