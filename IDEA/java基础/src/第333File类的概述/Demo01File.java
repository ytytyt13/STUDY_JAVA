package 第333File类的概述;

import java.io.File;

/**
 * @author yt13yt
 * @create 2019-11-29 21:57
 */
/*
* java.io.File文件和路径抽象表示形式
* java把电脑的文件和文件夹封装成为了一个File类，可以使用File类对文件进行操作
* 创建一个文件夹
* 删除文件夹
* 判断文件是否存在
* 对文件夹进行遍历
* 获取文件夹的大小
*
* 重点记住三个单词：
* file文件
* directory 文件夹
* path 路径
*
* */

public class Demo01File {
    public static void main(String[] args) {
        /*
         * static String pathSeparator与系统有关的路径分隔符，为了方便，为了方便表示为一个字符串
         * static char pathSeparatorChar 与系统有关的路径分隔符
         *
         * static String separator与系统有关的默认名称分隔符，为了方便，他被定义成为一个字符串
         * static char separatorChar与系统有关的默认名称分隔符
         * 操作路径，不能够写死了，防止因为路径引起的错误
         * C:\develop\a\a.txt  windows
         * C:/develop/a/a.txt linux
         * "C:"+File.separator+"develop"+File.separator+"a"+File.separator+"a.txt"
         * */

        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//路径分隔符，windows；分号。Linux ：冒号

        String separator = File.separator;//文件名称分隔符windows:反斜杠\,linux：正斜杠/
        System.out.println(separator);


        show01();
        show02();
        show03();
        show04();
        show05();
        show06();
        show07();
    }
    /*
     * File类的构造方法
     *String File(String str) 通过给定的路径得名称转换为抽象路径来创建一个新的file类
     * 参数
     * str 路径名称
     * 路径可以使用文件结尾或者已文件夹结尾
     * 路径可以存在也可以不存在，创建file得路径只是封装成为对象
     * */
    public static  void show01()
    {
        File f1=new File("C:\\Users\\YT\\Documents\\2019\\201910\\java_study\\IDEA\\study_html\\src\\image");
        System.out.println(f1);
    }

    /*
    * File类的常用方法：
    * public String getAbsolutePath()   返回次File的绝对路径名字字符串
    * public String getPath() 将此file转化为路径名字字符串
    * public String getName() 返回由此file表示的文件或者目录的名称
    * public long length() 返回由此的file表示的文件的长度
    *
    * */

    public static void show02(){
        /*
        * public String getAbsolutePath()   返回次File的绝对路径名字字符串
        *
        * 返回此file的绝对路径名称字符串
        * 无论路径传递的是绝对路径还是相对路径，返回的都是绝对路径
        *
        *  */
        File f1=new File("C:\\Users\\YT\\Documents\\2019\\201910\\java_study\\IDEA\\study_html\\src\\image");
        String absolutePath1=f1.getAbsolutePath();
        System.out.println(absolutePath1);

    }

    public static void show03(){
        /*
         * public String getPath()   返回次File的绝对路径名字字符串
         *
         *
         * 是绝对的就返回绝对的，是相对的就返回相对的
         *  */
        File f1=new File("C:\\Users\\YT\\Documents\\2019\\201910\\java_study\\IDEA\\study_html\\src\\image");
        String absolutePath1=f1.getPath();
        System.out.println(absolutePath1);

    }



    public static void show04(){
        /*
         * public String getName()   返回次File的构造方法路径中的结尾部分
         *  */
        File f1=new File("C:\\Users\\YT\\Documents\\2019\\201910\\java_study\\IDEA\\study_html\\src\\image");
        String absolutePath1=f1.getName();
        System.out.println(absolutePath1);

    }

    public static void show05(){
        /*
         * public long length() 返回由此的file表示的文件的大小，以子字节为单位，不能够获取文件夹的大小，
         * 如果文件不存在，则返回0
         *  */
        File f1=new File("C:\\Users\\YT\\Documents\\2019\\201910\\java_study\\IDEA\\study_html\\src\\image");
        long l1=f1.length();
        System.out.println(l1);

    }


    /*
    * Flie的判断方法类
    * public boolean exists() 判断File表表示的文件或目录是否实际存在
    * public Boolean isDirectory()  //判断File表示是否为目录
    * public boolean isFile()   //判断File表示是否为文件
    *
    * */

    /*
    * File 创建与删除功能的方法
    * //只能创建文件，不能够创建文件夹
    * public Boolean createNewFie() 当且仅当具有该名称的文件尚不存在时，创建一个新的空位文件
    * public boolean delete() 删除此File文件或者目录
    * public boolean mkdir() 只能创建单级目录
    * public boolean mkdirs() 创建由此file表示的目录，包括任何必须的但不存在的父目录
    *
    * */


    /*
    * File文件夹的遍历功能
    * public String[] list() 返回一个String数组，表示该File目录中的所有子文件或目录
    * public File[] listFiles() 返回一个File数组，表示该File目录中的所有子文件或目录
    * 注意事项：
    * list()方法和list file方法便利的的是构造方法中给出的目录
    * 如果构造方法中给出的路径不存在，会抛出空指针异常
    * 能够获取隐藏的文件
    * */
    public static void show06(){
        File f1=new File("C:\\Users\\YT\\Documents\\2019\\201910\\java_study\\IDEA\\study_html\\src\\image");
        String[] l1=f1.list();
        for(String s:l1){
            System.out.println(s);
        }

    }

    /*
    * 递归打印多级目录
    * */
    public static void show07(){
        File f1=new File("C:\\Users\\YT\\Documents\\2019\\201910\\java_study\\IDEA\\study_html");
        getAllFile(f1);
    }
    //定义一个方法，传递file类，
    public static void getAllFile(File file){
        File[] files=file.listFiles();
        for(File f:files)
        {
            if(f.isDirectory()){
                getAllFile(f);
            }else
            {
                System.out.println(f);
            }
        }
    }


    //定义一个方法，返回.java结尾的文件
    public static void show08(){
        File f1=new File("C:\\Users\\YT\\Documents\\2019\\201910\\java_study\\IDEA\\study_html");
        getAlljava(f1);
    }

    public static void getAlljava(File file){
        File[] files=file.listFiles();
        for(File f:files)
        {
            if(f.isDirectory()){
                getAllFile(f);
            }else
            {
                String s=f.toString();
                boolean b=s.endsWith(".java");
               if(b)
                   System.out.println(f);
            }
        }
    }

    /*
    * 使用过滤器
    * File[] listFile(FileFilter filter)  用于抽象路径名的过滤器，用于过滤文件
    * 抽象方法：过滤文件的方法
    *
    * */

}

