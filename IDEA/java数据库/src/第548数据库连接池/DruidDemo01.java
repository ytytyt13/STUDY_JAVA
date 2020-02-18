package 第548数据库连接池;

import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author yt13yt
 * @create 2019-12-13 19:57
 */
/*
*  Druid：数据库连接池实现技术，由阿里巴巴提供的
		1. 步骤：
			1. 导入jar包 druid-1.0.9.jar
			2. 定义配置文件：
				* 是properties形式的
				* 可以叫任意名称，可以放在任意目录下
			3. 加载配置文件。Properties
			4. 获取数据库连接池对象：通过工厂来来获取  DruidDataSourceFactory
			5. 获取连接：getConnection
		* 代码：
			 //3.加载配置文件
	        Properties pro = new Properties();
	        InputStream is = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
	        pro.load(is);
	        //4.获取连接池对象
	        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
	        //5.获取连接
	        Connection conn = ds.getConnection();
*
*
* */
public class DruidDemo01 {
    public static void main(String[] args) throws Exception {
        //1.导入java包
        //2.定义配置文件

        //3.加载配置文件
        Properties pro=new Properties();
        InputStream inputStream = DruidDemo01.class.getClassLoader().getResourceAsStream("druid.properties");

        pro.load(inputStream);

        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        //4.获取连接池对象
        Connection conn =ds.getConnection();
        System.out.println(conn);


    }
}
