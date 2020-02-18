package 第529JDBC;

import JDBCUtils.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * @author yt13yt
 * @create 2019-12-12 22:03
 */

/*
*练习
* 需求：
*  1，通过键盘录入用户名和密码
*
*  2，判断用户是否登录成功
*
*
*
* */
public class JDBCDemo09 {


    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username=sc.nextLine();
        System.out.println("请输入密码：");
        String password=sc.nextLine();

        boolean flag=new JDBCDemo09().login(username,password);
        if(flag)
            System.out.println("登录成功");
        else
            System.out.println("密码错误");


        //2.调用方法

        //3.判断结果
    }
    /*
    * 登录方法
    *
    * */
    public boolean login(String username,String password)
    {

        Connection conn=null;
        PreparedStatement pstm=null;
        ResultSet rs=null;
        if(username==null||password==null)
        {
            return false;
        }
        //1.获取链接
        try {
            conn= JDBCUtils.getConnection();

            String sql="select * from user where username=? and password=?";

            pstm=conn.prepareStatement(sql);

            pstm.setString(1,username);
            pstm.setString(2,password);

            //stmt = conn.createStatement();

            rs=pstm.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

            JDBCUtils.close(pstm,conn);
        }

        return false;
    }

}
