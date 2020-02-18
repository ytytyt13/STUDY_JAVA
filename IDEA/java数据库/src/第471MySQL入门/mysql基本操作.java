package 第471MySQL入门;

/**
 * @author yt13yt
 * @create 2019-12-06 19:56
 */

/*
* MySQL启动
* 端口3306
* 1.cmd输入services.msc
* 2.使用管理员权限运行cmd
*   输入net start mysql

*MySQL关闭
* 1.管理员权限运行cmd
* 2.输入 net stop mysql
*
*
 * MySQL登录
 * 默认链接本地的mysql
 * 1.mysql -uroot -p1313 启动服务
 *
 * 远程链接
 * 1.mysql -h127.0.0.1 -uroot -p1313
 * 2.mysql --host=ip --user=root --password=m密码
 *
 * 退出
 * quit
 * exit
 *
 * MySQL的安装目录结构
 * 1，mysql的安装目录
 * --bin 二进制的可执行文件，将bin安装到path
 * --data
 * --include
 * --lib 库文件
 * --share
 * --my.ini MySQL的配置目录
 *
 * 2.MySQL的数据目录
 * c盘隐藏目录 programData
 * --Mysql
 *  --MySQL server5.5
 *      --data
 *
 * MySQL服务器
 * --数据库(文件夹)
 *   --表1（文件）
 *     --数据记录1（文件里面的数据）
 *     --数据记录2
 *     --数据记录3
 *   --表2
 * --数据库
 *   --表1
 *     --数据记录1
 *     --数据记录2
 *     --数据记录3
 *   --表2
 *
 * MySQL数据库软件的操作
 * SQL语句操作
 * structued Query Language
 * 定义了一种操作所有关系型数据库的规则。每一种数据库操作的方式存在不一样的地方称为方言
 *
 * sql通用语法
 * 1.sql语句可以单行或多行进行书写，以分号结尾
 * 2.使用空格和缩进来增强可读性
 * 3.mysql数据库的SQL不区分大小写
 * 4。注释
 *  单行注释：
 *  1. -- 注释内容   -- 注释内容必须要有空格
 *  2. 注释内容
 *  多行注释
 *  1./*注释内容*/
/*
 SQL的分类：
 分为四大类：
 1) Data Definition Language (DDL 数据定义语言) 如：建库，建表
   1.操作数据库CRUD
       1.C(Create) 增加数据库
            create database 数据库名；
            create database if not exists 数据库名; -- 数据库存在则不创建
            create database 数据库名 character set gbk; 指定不同的数据库字符集
            综合练习：创建数据库db4,判断是否存在，并制定字符集为gbk
            *mysql> create database if not exists db4 character set gbk;
       2.R(Retrieve) 查询数据库
            show databsaes； 查询所有的数据库名称
            | information_schema |  视图
            | mysql              |  核心数据
            | performance_schema |  性能提升
            | test

            查询某个数据库的字符集，查询某个数据库的创建语句
            --show create database 数据库名;

 *
 *      3.U(Update) 修改
           修改数据库的字符集
           --alter database 数据库名称 character set 字符集名称；

*       4.D(Delete) 删除
           删除某一个数据库
           --drop database 数据库名称；
           --drop database if exist 数据库名称；

*       5.使用数据库
           查询当前正在使用的数据库的名称
           --select database();

           使用数据库
           --use 数据库名称；
*
*
* 2) Data Manipulation Language(DML 数据操纵语言)， 如：对表中的记录操作增删改
    1.操作数据库CRUD
       1.C(Create) 增加数据表
            1，语法：
            --create table 表名(
                    列名1 数据类型1,
                    列名2 数据类型2,
                    列名3 数据类型3,
                    ...
                    列名n 数据类型n        #注意最后一列不要逗号
            );

            例如，创建表
            create table student(
            id int,
            name varchar(32),
            age int,
            score double(4,1),
            birthday date,
            insert_time timestamp
            );

            数据类型：
            --int 整数类型
            例如：age int,
            --double 小数类型
            例如：score double(5,2), 五位保留两位小数
            --date 日期 #只包含年月日 yyyy-MM-dd
            --datetime 日期 #包含年月日时分秒 yyyy-MM-dd HH:mm:ss
            --timestamp 时间戳类型 #如果美誉给当前的字段赋值，则默认采用当前时间

            --varchar 字符串
            例如：name varchar(20), 姓名最大20个字符


       2.R(Retrieve) 查询数据库
            查询某一个数据库中所有表的名称
            --show tables;

            查询表的结构
            desc 表名；

       3.U(Update) 修改
        1.修改表的表名
        --alter table 表名 rename to 新的表名；
        2.修改表的字符集
        --show create table 表名；
        --alter table 表名 character set 字符集名称;
        3.添加一列
        --alter table 表名 add 列名 数据类型
        例如 alter table student add sex varchar(5);
        4.修改一列的名称，类型
        --alter table 表名 modify 列名 新列名 数据类型
        例如 alter table student modify sex  new_sex varchar(5);
        --alter table 表名 change 列名 新列名 数据类型；
        例如 alter table student change new_sex sex varchar(5);
        5.删除一列
        alter table drop 列名；



       4.D(Delete) 删除
            drop table 表的名称；
            drop table if exists 表名；

       5.使用数据库



       DML增删改表中的数据
       1。添加数据：
       语法:
       insert into 表名(列名1，列名2，列名3，。。。，列名n)value(值1，值2，。。值n)；
        注意事项：
        列名与值一一对应，不仅名字对应，类型也要对应
        如果表明后不定义列名，则给所有的值都要添加
        除了数字类型，其他类型需要使用引号引起来，如期也要引起来

        2.删除数据
        delete from 表名 where 条件;
        注意
        如果不加条件，则删除所有的记录，不推荐用来删除所有数据，一条一条的删除，效率低下。

       删除所有的数据：
       truncate table 表名；
       删除表，然后再创建一个一摸一样的空表


       3.修改数据
       update 表名 set 列名1=值1，列名2=值2；
       注意如果不加条件，则将表中所有的数据全部修改


* 3) Data Query Language(DQL 数据查询语言)，如：对表中的查询操作

        查询表中的数据
        select* from 表名；

        1.语法
        select
           字段列表
        from
           表名列表
        where
           条件列表
        group by
           分组字段
        having
           分组之后的条件
        order by
           排序
        limit
           分页限定

        2.基础的查询
            1。多字段的查询
            查询指定的列
            SELECT id,NAME FROM student;
            查询时去重
            select distinct address from student;
            SELECT DISTINCT address FROM student;
            SELECT DISTINCT NAME,address FROM student WHERE address='香港';

            select name,math,english,math+english from student;
            如果有null参与的结构都为null

            SELECT NAME,math,english,math+IFNULL(english,0) FROM student;

            起别名
            AS

            条件查询
            1.where 条件；
            2.运算符
            *,>,<,<=,>=,=,<>就是不等号
            查询时null不能够使用=，>等符号判断 要用is

            between and
            in

            like
            模糊查询
             占位符：
             - 单个任意字符
             % 多个任意字符

            is null
            and &&
            or
            not !


CREATE TABLE student(
id INT, -- 编号
NAME VARCHAR(20), -- 姓名
age INT, -- 年龄
sex VARCHAR(5), -- 性别
address VARCHAR(100), -- 地址
math INT, -- 数学
english INT -- 英语
);
INSERT INTO student(id,NAME,age,sex,address,math,english) VALUES (1,'马云',55,'男','
杭州',66,78),(2,'马化腾',45,'女','深圳',98,87),(3,'马景涛',55,'男','香港',56,77),(4,'柳岩',20,'女','湖南',76,65),(5,'柳青',20,'男','湖南',86,NULL),(6,'刘德华',57,'男','香港',99,99),(7,'马德',22,'女','香港',99,99),(8,'德玛西亚',18,'男','南京',56,65);

SELECT* FROM student;

DROP TABLE stu;
DROP TABLE student;
DROP TABLE student3;

SELECT id,NAME FROM student;

SELECT address FROM student;


SELECT DISTINCT address FROM student;

SELECT DISTINCT NAME,address FROM student WHERE address='香港';

SELECT NAME,math,english,math+english FROM student;

SELECT NAME,math,english,math+IFNULL(english,0) FROM student;

SELECT NAME,math,english,math+IFNULL(english,0) AS "总分" FROM student;

SELECT* FROM student;

SELECT* FROM student WHERE age>=20;

SELECT* FROM student WHERE age !=20;

SELECT* FROM student WHERE age BETWEEN 20 AND 30;

SELECT* FROM student WHERE age IN(19,22,25);

SELECT* FROM student WHERE english IS NOT NULL;

SELECT* FROM student WHERE NAME LIKE "马%";

SELECT* FROM student WHERE NAME LIKE "___"

UPDATE student SET NAME = '柳岩' WHERE age=20;

SELECT*  FROM student WHERE NAME LIKE"%德%";

1.查询语句：
    1.排序查询
    2.聚合函数
    3.分组查询
    4.分页查询
2.约束
3.多表之间的关系
4.范式
5.数据库的备份与还原

    1.排序查询
        语法 order by 子句
        order by 排序字段1 牌序方式1，排序字段2 排序方式2；
        排序方式：
        默认升序排序，desc降序排序
SELECT* FROM student ORDER BY math；
SELECT* FROM student ORDER BY math ASC；
SELECT* FROM student ORDER BY math DESC;

如果有多个排序条件，当前面的条件一致时才使用后面的规则
SELECT* FROM student ORDER BY math ASC,english DESC;

    2.聚合函数
    将一列数据作为一个整体，然后纵向的计算，算一列的数据
    1.count 表示计算个数
     SELECT COUNT(NAME) FROM student;
     排除null的方法：
     SELECT COUNT(IFNULL(english,0)) FROM student;
     或者一般选择非空列，主列


     注意：聚合函数的计算，会排除null值


    2.max 计算最大值
    SELECT MAX(math) FROM student;

    3.min 计算最小值

    4.sum 求和
    SELECT SUM(math) FROM student;


    5.avg 计算平均数
    SELECT AVG(math) FROM student;

    3.分组查询
    分组查询
    group by 分组字段；
    注意：
    1.分组之后查询字段，要么是分组字段，要么是聚合函数的字段
    SELECT sex,AVG(math)FROM student GROUP BY sex;
    SELECT sex,COUNT(id) FROM student GROUP BY sex;
SELECT sex,AVG(math) FROM student GROUP BY sex;

SELECT sex,COUNT(id) FROM student GROUP BY sex;

SELECT sex FROM student GROUP BY sex;

SELECT sex,AVG(math),COUNT(id) FROM student WHERE math>70 GROUP BY sex ;

SELECT sex,AVG(math),COUNT(id) FROM student WHERE math>70 GROUP BY sex HAVING COUNT(id)>2;
SELECT sex,AVG(math),COUNT(id) AS 人数 FROM student WHERE math>70 GROUP BY sex HAVING 人数>2;
  在where与having的区别
  where 在分组之前进行限定，不满足条件不计算
  having 在分组之后进行限定，不满足条件
  where后面不能根据聚合函数
  having后面可以根聚合函数

    4.分页查询
    limit 开始的索引，每页的条数;
    SELECT* FROM student LIMIT 0,3;  --第一页
    SELECT* FROM student LIMIT 3,3;  --第二页

    公式：开始的索引=（当前页码-1）*每页显示的条数；
    limit是mysql的方言；

            2.去除重复
            dinstinct
            3.计算列
            count
            4.起别名
            as

约束：
对表中的数据进行限定，保证数据的正确性，有效性，完整性；
分类
主键约束 primary key
非空约束 not null
唯一约束 unique
外键约束 foreign key

非空约束：
    not null
    1.在创建表时添加约束：
    CREATE TABLE stu(
    id INT,
    NAME VARCHAR(20) NOT NULL
    );
    2.创建表完成后添加非空约束
    alter table stu modify name varchar(20) not null;

    ----删除name的非空约束
    alter table stu modify name varchar(20);

唯一约束：
unique 值不能够重复但是可以为空
1.创建表时添加唯一约束
CREATE TABLE stu(
id INT,
phonenum VARCHAR(20) UNIQUE
);

删除唯一约束
alter table stu drop index phonenum;

在创建表后，添加唯一约束
alter table stu modify phonenum varchar(20) unique;


3.主键约束 primary key
1。注意；非空且唯一；
2.一张表只能够有一个字段为主键约束；
3.主键就是表中记录的唯一标识；

创建表时添加主键约束
create table stu(
id int primary key,
name varchar(20)
);

表创建完成之后添加主键
alter table stu modify id int primary;

删除主键
alter table stu drop primary key;

主键约束自动增长；
某一列是数值类型的，在使用auto_increment可以来完成的自动增长

添加主键并且完成主键的自动增长
create table stu(
id int primary key auto_increment,
name varchar(20)
);

--删除自动增长
alter table stu modify id int;

--添加自动增长
alter table stu modify id int auto_increment

外键约束 foreign key
--数据有冗余
create table 表名(
....
外键列
constraint 外键名称 foreign key (外键列名称) reference 主表名称(主表列名称)
);

删除外键
alter table employee drop foreign key emp_dept_fk;

添加外键
alter table employee add constraint emp_dept_fk foreign key(dep_id) reference department(id);

级联操作：
一些联动的操作，当一个表中的数据改变，其他关联的表中的数据也可以改变
update employee set dep_id=null where dep_id=1;
添加外键时设置级联
constraint 外键名称 foreign key (外键列名称) reference 主表名称(主表列名称) on update_cascade;
级联删除
constraint 外键名称 foreign key (外键列名称) reference 主表名称(主表列名称) on delete_cascade;



数据库的设计
    1.多表之间的关系
        一对一
         如：人和身份证
         分析：一个人只有一个身份证，一个身份证只能对应一个人
        一对多
         如：部门和员工
         分析：一个部门有多个员工，一个员工只能属于一个部门
        多对多
         如：学生和课程
         分析：一个学生有很多课程，一个课程可以有很多学生

     2.多表之间的实现
        1.一对多的关系
         在多的一方建立外键，指向一方的主键
        2.多对多的关系
         借助第三张中间表，中间表至少包含两个字段，分别包含两个表的主键
         小知识点：联合主键

        3.一对一的关系
         在任意的一方添加外键来指向另一方的主键，并且让外键唯一


    2。数据库设计的范式
      在设计数据库时需要遵循的规范
      目前有六种范式，一般使用前三种范式

      分类
        1.第一范式（1NF）每一列都是不可分割的原子数据项
        2.第二范式（2NF）在1NF的基础上，非码属性必须完全依赖于主码，在1NF的基础上消除非主属性的对主码的部分函数依赖

            1.函数依赖：
            通过a的属性值可以确定b的属性值，则称b依赖于属性a;
            例如：学号被姓名依赖
            2.属性组：
            （学号，课程名称）确定唯一的分数
            3.完全函数依赖：
            如何a是一个属性组，则b属性值的确定需要依赖a属性组中所有的属性值。
            例如 （学号，课程名称）->分数
            4.部分完全依赖：
            如果a是一个属性组，则b属性的值的确定只需要依赖与a属性组的某一些值即可
            例如：（学号，课程名称）->姓名

            4.传递函数依赖
            a->b->c;
            入股通过a属性可以唯一确定b属性的值，通过b属性的值可以唯一确定c属性的值。
            a被c传递依赖
            例如：学号->系名->系主任

            5.码
            如果在一张表中，一个属性或一个属性组，被其他所有的属性完全依赖，则称这个属性（属性值）为该表的码
            例如：该表中码为一个属性组
            主属性：码属性组中的所有属性
            非主属性：其他的除了码组的属性





        3.第三范式（3NF）在2NF的基础上，任何非主属性不依赖其他非主属性(消除传递依赖)


数据库的还原与备份
    防止数据的丢失 mysqldump -u用户名 -u密码 数据库名或表名>保存的路径
    还原：
       1.登录数据库
       2，创建数据库
       3.使用数据库
       4。执行文件，source 文件路径











* 4) Data Control Language(DCL 数据控制语言)，如：对用户权限的设置
*
*


多表查询
    查询语法
        select 列明列表 from 表名列表 where ...

准备数据：
CREATE TABLE dept(
id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(36)
);
INSERT INTO dept (NAME) VALUES ("开发部"),("市场部"),("财务部");

CREATE TABLE emp (
id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(10),
gender CHAR(1), -- 性别
salary DOUBLE, -- 工资
join_date DATE, -- 入职日期
dept_id INT,
FOREIGN KEY (dept_id) REFERENCES dept(id) -- 外键，关联部门表(部门表的主键)
);
INSERT INTO emp(NAME,gender,salary,join_date,dept_id) VALUES('孙悟空','男',7200,'2013-02-24',1);
INSERT INTO emp(NAME,gender,salary,join_date,dept_id) VALUES('猪八戒','男',3600,'2010-12-02',2);
INSERT INTO emp(NAME,gender,salary,join_date,dept_id) VALUES('唐僧','男',9000,'2008-08-08',2);
INSERT INTO emp(NAME,gender,salary,join_date,dept_id) VALUES('白骨精','女',5000,'2015-10-07',3);
INSERT INTO emp(NAME,gender,salary,join_date,dept_id) VALUES('蜘蛛精','女',4500,'2011-03-14',1);


SELECT* FROM emp,dept;
-- 笛卡尔积 A，B；
   有两个集合，取这两个集合的所有组成情况
   要完成多表查询，需要消除无用的数据

多表查询的分类：
1.内连接查询
    1.隐式内连接：使用where条件消除多余条件
        select * from empt,dept where emp.dept_id=dept.id;
        SELECT * FROM emp,dept WHERE emp.`dept_id`=dept.`id`;

        查询员工表的名称，性别，部门表的名称
        SELECT emp.`name`,emp.`gender`, dept.`name` FROM emp,dept WHERE emp.`dept_id`=dept.`id`;
        简化版模式
        SELECT
            t1.name,t1.gender,t2.name
        FROM
            emp t1,dept t2
        WHERE
            t1.`dept_id`=t2.`id`;

    2.显示内连接
        select 字段列表 from 表名1 inner join 表名2 on 条件;
        SELECT * FROM emp INNER JOIN dept ON emp.`dept_id`=dept.`name`;
        SELECT * FROM emp JOIN dept ON emp.`dept_id`=dept.`name`;
    内连接查询注意事项：
        1.从哪些数据表中查询
        2.条件是什么
        3.查询哪些字段

2.外连接查询
    1.左外链接（查询的是左表的所有数据以及其交集部分）
        基本语法
            select 查询字段列表 from 表1 left outer join 表2 on 条件;
    2.右外链接（查询的是右表的所有数据以及其交集部分）
        基本语法
            select 查询字段列表 from 表1 right outer join 表2 on 条件;
3.子查询
    概念：查询中嵌套查询，称嵌套查询为子查询
    查询最高的工资：
        select max(salary) from emp;
        select* from emp where emp.salary =9000;
    一条查询：
    select *from emp where salary=(select max(salary) from emp);

子查询的不同情况：
    1.子查询的结果是单行单列的
        子查询可以作为条件，
        例如：查询小于平均工资的人
        SELECT * FROM emp WHERE emp.`salary`<(SELECT AVG(salary) FROM emp);

    2.子查询的结果是多行单列的
        例如：查询财务部所有的员工信息，使用in
        SELECT id FROM dept WHERE NAME="财务部" OR NAME="市场部";

        SELECT * FROM emp WHERE dpet_id=3 OR dept_id=2;

        SELECT * FROM emp WHERE dept_id IN (3,2);

        SELECT * FROM emp WHERE dept_id IN (SELECT id FROM dept WHERE NAME="财务部" OR NAME="市场部" );

    3.子查询的结果是多行多列的（多行多列的子查询作为一张表的查询）
      例如：查询员工的入职日期是2011年11月11日之后的员工信息和部门信息
      SELECT * FROM dept t1,(SELECT * FROM emp WHERE emp.`join_date`>"2011-11-11") t2 WHERE t1.id=t2.dept_id;

    多表查询的联系

   1.事物的基本介绍：
    1.概念：
        如果一个包含多个步骤的业务操作，被事务管理，要么同时成功，要么同时失败

        例如：张三给李四转账500块
        1.查询张三账户金额是否大于500
        2.张三账户 金额-500
        3.李四账户 金额+500
        -- 开启事物
START TRANSACTION;
UPDATE account SET balance=balance-500 WHERE NAME='zhangsan';

UPDATE account SET balance=balance+500 WHERE NAME='lisi';

-- 发现问题就回滚

ROLLBACK;
--没有问题就提交
COMMIT;

mysql默认执行一句DML就自动提交一次
事务提交的两种方式
手动：需要先开启事物，再提交
自动：mysql默认

修改事物的默认提交方式

select @@autocommit;
   1代表自动提交
   0代表手动提交

   改变提交的方式
   set @@autocommit=0;

   2.事物的基本特征
   3.事物的隔离级别

事物的四大特征：
    1.原子性：事物是不可分割的最小操作单位，要么同时成功，要么同时失败
    2.持久性：如果事物一旦提交或者回滚，数据库的数据会更新
    3.隔离性：多个事物之间不相互影响，相互独立
    4.一致性：表示事物操作前后，事物的总量不变

事物的隔离级别：
    概念：多个事物之间是相互独立的，但是如果多个事物操作同一个数据，则会引发问题
            设置不同的隔离级别，解决这些问题
    存在问题：
    1.脏读：一个事务读到了另一个事务中没有提交的数据
    2.不可重复读：（虚度）在同一事务中，两次读取到的数据不一样
    3.幻读：一个事物操作（DML）数据表中所有的记录，另一个事务添加了一条数据，则第一个事务查询不到
           自己的修改。

    隔离级别：
    1.read uncommitted:读取未提交
      产生的问题：脏读，不可重复读，幻读
    2.read committed:读已提交
      产生的问题：不可重复读，幻读
    3.repeatable 可重复读
    4.serializable 串行化

    注意：隔离级别从小到大安全性越来越高，但是效率越来越低

    数据库查询隔离级别：
    select @@tx_islutation;

    设置隔离级别：
    set global transaction isolation_level 级别字符串；


用户的管理与授权：
    DBA数据库管理员
    1.管理用户
        查询用户
            --1.切换到mysql数据库，查询user表

        添加用户
            -- create user "用户名"@"主机名" identified by "密码";

        删除
            drop user"用户名"@"主机名"

        修改用户密码
            update user set password ("新用户名") where user="用户名";
            set password for "用户名"@"主机名"=password("新密码");

            mysql中忘记了root用户的密码：
                1.cmd -》》net stop mysql 以管理员身份停止掉mysql的服务
                2.启动无验证方式的mysql的服务：
                 mysqld --skip-grant-tables

    2.授权用户(权限管理)
    查看权限
        show grants for "用户名"@"主机名";

    授予权限
        grant 权限列表 on 数据库名.表名 to 用户名.主机名
    撤销权限

























* */
public class mysql基本操作 {
}
