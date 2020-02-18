package 第548数据库连接池;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author yt13yt
 * @create 2019-12-13 20:23
 */
/*使用工具类*/

public class DruidDemo02 {
    public static void main(String[] args) {
        /*
        * 完成数据添加的操作，给account添加一条记录
        * */
        Connection conn=null;
        PreparedStatement pstm=null;

        try {
            //1.获取链接
            conn =JDBCUtils.getConnection();


            //定义sql
            String sql="insert into account values(null,?,?)";

            pstm=conn.prepareStatement(sql);
            pstm.setString(1,"lala");
            pstm.setDouble(2,3000);

            int count = pstm.executeUpdate();

            System.out.println(count);


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstm,conn);
        }


    }
}
