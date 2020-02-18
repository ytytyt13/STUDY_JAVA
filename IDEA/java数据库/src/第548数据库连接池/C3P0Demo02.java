package 第548数据库连接池;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author yt13yt
 * @create 2019-12-13 19:43
 */
public class C3P0Demo02 {
    public static void main(String[] args) throws SQLException {
        //1.获取DataSource.可以指定配置文件的名称
        DataSource ds=new ComboPooledDataSource();
        //2.获取链接
        for(int i=0;i<11;i++)
        {
            Connection conn=ds.getConnection();
            System.out.println(conn);

            if(i==5)
            {
                conn.close();
            }
        }
    }
}
