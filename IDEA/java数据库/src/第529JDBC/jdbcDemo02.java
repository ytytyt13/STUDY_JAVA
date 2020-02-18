package 第529JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author yt13yt
 * @create 2019-12-12 19:04
 */

/*
* account表添加一条记录 insert语句的联系
*
* */
public class jdbcDemo02 {

    public static void main(String[] args) throws SQLException {
        Statement stmt=null;
        Connection conn=null;
        //1.注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //3.获取数据库连接对象
            conn = DriverManager.getConnection("jdbcDemo03:mysql:///db4", "root", "1313");
            //4.获取执行sql的对象
            stmt = conn.createStatement();

            String sql="insert into account values(null,'王五',3000)";
            //5.执行sql
            int count=stmt.executeUpdate(sql);
            System.out.println(count);
            if(count>0)
                System.out.println("打印成功");
            else
                System.out.println("打印失败");

            stmt.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //stmt.close();
            //conn.close();

            //避免空指针异常
            if(stmt!=null)
                stmt.close();
            if(conn!=null)
                conn.close();
        }
        //2.
    }
}


