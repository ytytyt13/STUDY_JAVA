package 第529JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author yt13yt
 * @create 2019-12-11 21:09
 */
public class jdbcDemo01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. 导入驱动jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbcDemo03:mysql://localhost:3306/db4", "root", "1313");
        //4.定义sql语句
        String sql = "update account set balance = 500";
        //5.获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();
        //6.执行sql
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        conn.close();
    }
}


/*
* 详解各个对象：
* DriverManager 驱动管理对象
* class DriverMannager
* 功能：
* 1.注册驱动
*       static void registerDriver(Driver driver):注册与给定的驱动程序 DriverManager
*       写代码使用 class forName("com.mysql.jbdc.Driver")调用registerDriver
*       告诉java程序使用哪一个数据驱动jar包
*       注意：mysql5之后的jar可以省略class.forName;
* 2.获取数据库链接
*       通过调用static Connnection getConnection(String url,String user,String password);
*       参数：
*       url 指定链接的路径
*           语法：
*               jdbcDemo03:mysql://ip地址（域名）：端口号/数据库名称
*               细节：如果链接的是本地的mysql的数据库，且端口为3306
                     则url可以简写为jdbc:mysql:///数据库名称
*       user 用户名
*       password 密码
*
* Connection 数据库链接对象
*   1.获取执行sql的对象
*       Statement createStatement();
*       PreparedStatement prepareStatement(String sql);
*   2.管理事务：
*       1.开启事务 void setAutoCommit(boolean autoCommit); //调用该方法设置参数为false，即开启事务
*       2.提交事务 void commit();
*       3.回滚事务 void rollback();
*
* Statement 执行sql的对象
*   用于执行静态sql语句并返回其结果对象
*   1.boolean execute(String sql); 可以执行任意的sql
*   2.int executeUpadte(String sql);执行DML语句（inseret,update,delete,DDL）语句
*       返回值：影响的行数
*       可以通过影响的行数，可以判断DML是否执行成功
*   3.ResultSet executeQuery(String sql); 执行dql语句，返回的是一个结果集对象
*
* ResultSet 结果集对象 封装查询的结果
*       常用方法：
*       1.next(); 游标向下移一行
*               当前行有数据，则返回true
*               当前行无数据，则返回false
*
*
*       2.getXxx(参数);获取数据
*        Xxxs:数据类型 如：int getint();
*        参数：获得列的名称 或则列数，编号从1开始
*
* 注意
* 使用步骤
* 1.游标向下移动一行
* 2.判断是否有数据
* 3.执行next，取数据
*
*
*

* jdbc的工具类 JDBCUtils
* 目的：简化数据写
* 分析，抽取方法。
*                   注册驱动
*                   获取链接对象
*                   释放资源
*
*
*PreparedStatement 执行sql的对象
* sql注入问题。输入用户名随便，密码a' or 'a'='a
* 在拼接sql时会造成安全性问题
*
* 2.解决sql诸如问题，使用PreparedStatememt对象
* 使用预编译的sql
*参数使用问号作为占位符，如select * from user where username=? and password = ?;
* PrepareStatement  Connection.PrepareStatement(String sql);
* setXXX(参数1，参数2)；
* 参数1 问好的位置
* 参数2 问好的值
*
*
*
*
*
* */
