package 第529JDBC;

import java.sql.*;

import JDBCUtils.JDBCUtils;


/**
 * @author yt13yt
 * @create 2019-12-12 20:11
 */
public class jdbcDemo05 {
    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        Statement stmt=null;
        ResultSet set=null;
        try {
            /*
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db4", "root", "1313");
             */
            conn=JDBCUtils.getConnection();
            String sql="select * from account";
            stmt=conn.createStatement();
            set =stmt.executeQuery(sql);

            while(set.next())
            {
                int id=set.getInt(1);
                String name=set.getString("name");
                double balance=set.getDouble(3);
                System.out.println(id+"---"+name+"---"+balance);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //stmt.close();
            //conn.close();

            //避免空指针异常
            JDBCUtils.close(stmt,conn);
        }
    }
}
