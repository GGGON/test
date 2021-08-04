package com.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatsUtils {
   private static SqlSessionFactory factory=null;
 static {   String config = "mybatis.xml";

     InputStream in = null;

     {
         try {
             in = Resources.getResourceAsStream(config);
              factory = new SqlSessionFactoryBuilder().build(in);
         } catch (IOException e) {
             e.printStackTrace();
         }
     }}

 public  SqlSession getSession(){
    //1.mybatis 主配置文件

    //2.读取配置文件


    //3.创建 SqlSessionFactory 对象,目的是获取 SqlSession

    //4.获取 SqlSession,SqlSession 能执行 sql 语句
     SqlSession session=null;
   if(factory!=null) {
        session= factory.openSession(true);
        }
     return  session;
 }
    }
