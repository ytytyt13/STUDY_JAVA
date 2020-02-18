package 第529JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author yt13yt
 * @create 2019-12-12 19:47
 */
public class jdbcDemo04 {

    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        Statement stmt=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db4", "root", "1313");
            String sql="delete from account where id=3";
            stmt=conn.createStatement();
            int count=stmt.executeUpdate(sql);
            if(count>0)
                System.out.println("打印成功");
            else
                System.out.println("打印失败");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
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
    }
}
