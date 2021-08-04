package com.test;

import com.utils.MyBatsUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybatistest {

    public static void main(String[] args) {
        MyBatsUtils myBatsUtils=new MyBatsUtils();
     SqlSession session= myBatsUtils. getSession();

        //5.执行 SqlSession 的 selectList()
        Student student=new Student(100,"张分","163@qq");
        int nums=session.insert("com.dao.StudentDao.insertStudents",student);
        //6.循环输出查询结果f
        session.commit();
        System.out.println("结束");
        //7.关闭 SqlSession，释放资源
         session.close();
    }


}
