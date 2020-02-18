package 第555JDBCTemplate;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import 第548数据库连接池.JDBCUtils;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author yt13yt
 * @create 2019-12-14 11:33
 */
public class JdbcTemplateDemo02 {
    //Junit单元测试，可以让那个方法独立的执行
    private JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());
    @Test
    public void test1(){
       //1。修改

        String sql="update emp set salary =8000 where id=1";
        int count =template.update(sql);
        System.out.println(count);
    }

    @Test
    public void test2(){
        //2.添加
        String sql="insert into emp(id,name,dept_id)values(?,?,?)";
        int count = template.update(sql, 11,"aa",3);
        System.out.println(count);
    }

    @Test
    public void test3(){
        //3.删除
        String sql="delete from emp where id=8 or id=9 or id=11";
        int count =template.update(sql);
        System.out.println("运行成功了");
    }

    @Test
    public void test4(){
        //4.查询所有的记录，将其封装成map集合
        String sql="select * from emp where id=?";
        Map<String, Object> map = template.queryForMap(sql, 1);
        System.out.println(map);
        //{id=1, name=孙悟空, gender=男, salary=8000.0, join_date=2013-02-24, dept_id=1}
    }



    @Test
    public void test5(){
        //5.查询所有记录，将其封装称为list,将每一条记录封装成为list集合
        String sql="select * from emp";
        List<Map<String, Object>> maps = template.queryForList(sql);
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }
    @Test
    public void test6_1(){
        //2.查询所有记录，将其封装称为list
        String sql="select * from emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : list) {
            System.out.println(emp);
        }

    }

    @Test
    public void test7(){
        //2.查询所有记录数
        String sql="select count(id) from emp";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }
}
