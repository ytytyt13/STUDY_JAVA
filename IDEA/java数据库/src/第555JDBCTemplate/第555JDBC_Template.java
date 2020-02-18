package 第555JDBCTemplate;

/**
 * @author yt13yt
 * @create 2019-12-13 20:30
 */
import org.springframework.jdbc.core.JdbcTemplate;
import 第548数据库连接池.JDBCUtils;

/*
* Spring JDBC
* Spring框架对JDBC的简单封装，提供了一个JDBCTemplate对象
* 1.导入java包
* 2.创建jdbcTempalte对象，依赖于数据源DateSource
*   JdbcTemplate template=new jdbcTempate(ds);
* 3.调用jdbcTemplate的方法来完成CRUD的操作
* update();执行增删改语句
* queryForMap() 查询结果将结果封装成map集合
* queryForList() 查询结果将结果封装成list集合
* query();查询结果将结果封装成JavaBean集合
* queryFroObject();查询结果将结果封装成JavaBean集合
* */
public class 第555JDBC_Template {
    public static void main(String[] args) {
        //1.导入java包
        //2.创建jdbctempalte对象
        JdbcTemplate tempalte=new JdbcTemplate(JDBCUtils.getDataSource());
        //3.调用方法
        int count=tempalte.update("update account set balance =5000 where id=?",4);
        System.out.println(count);

        /*
        * 需求：
        * 1.修改1号数据 salary为10000；
        * 2.添加一条记录
        * 3.删除刚才添加的记录
        * 4.查询所有的记录，将其封装成map集合
        * 5.查询所有记录，将其封装称为list
        * 6.查询所有记录，将其封装称为list
        * 7.查询所有的记录数
        * */


    }


}
