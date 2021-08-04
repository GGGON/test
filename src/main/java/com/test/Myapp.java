package com.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Myapp {
    public static void main(String[] args) {


    //1.mybatis 主配置文件
    String config = "mybatis.xml";
    //2.读取配置文件
    InputStream in = null;

    {
        try {
            in = Resources.getResourceAsStream(config);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //3.创建 SqlSessionFactory 对象,目的是获取 SqlSession
    SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
    //4.获取 SqlSession,SqlSession 能执行 sql 语句
    SqlSession session = factory.openSession();
    //5.执行 SqlSession 的 selectList()

    List<Student> studentList =session.selectList("com.dao.StudentDao.selectStudents");

    //6.循环输出查询结果f
        for (Student stu:studentList
             ) {
            System.out.println(stu);
        }
    //7.关闭 SqlSession，释放资源

}
}
