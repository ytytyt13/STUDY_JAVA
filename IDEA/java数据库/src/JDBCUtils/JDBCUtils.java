package JDBCUtils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author yt13yt
 * @create 2019-12-12 20:48
 */
/*
* jdbc
*注册驱动
 *获取链接对象
 *释放资源
* */

public class JDBCUtils {
    //获取链接，返回链接对象
    /*
    * 使用配置文件，不用传递参数，=
    * 解决方案，通过配置文件
    * 只需要读取一次即可拿到这些值
    *
    * */

    private static String url;
    private static String user;
    private static String password;
    private static String driver;
    static{

        try {
            //读取资源文件，获取值
            Properties pro=new Properties();
            pro.load(new FileReader("java数据库/src/JDBCUtils/jdbc.properties"));
            url=pro.getProperty("url");
            user=pro.getProperty("user");
            password=pro.getProperty("password");
            driver=pro.getProperty("driver");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    //释放资源
    public static void close(Statement stmt,Connection conn)
    {
        if(stmt!=null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn!=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
