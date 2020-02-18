package 第548数据库连接池;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.Statement;

/**
 * @author yt13yt
 * @create 2019-12-13 20:10
 */

public class JDBCUtils {

    //1.定义成员变量 DataSource
    private static DataSource ds;

    static{
        try {
            //1.加载配置文件
            Properties pro = new Properties();
            pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            //2.获取DataSource
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    /**
     * 释放资源
     */
    public static void close(Statement stmt,Connection conn){
			       /* if(stmt != null){
			            try {
			                stmt.close();
			            } catch (SQLException e) {
			                e.printStackTrace();
			            }
			        }

			        if(conn != null){
			            try {
			                conn.close();//归还连接
			            } catch (SQLException e) {
			                e.printStackTrace();
			            }
			        }*/

        close(null,stmt,conn);
    }


    public static void close(ResultSet rs , Statement stmt, Connection conn){


        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        if(stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(conn != null){
            try {
                conn.close();//归还连接
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取连接池方法
     */

    public static DataSource getDataSource(){
        return  ds;
    }

}
