package com.springtest2.test;

import com.springtest2.day01.dao.Student;
import com.springtest2.day01.dao.UserDao;
import com.springtest2.day01.service.Custoerervice;
import com.springtest2.day01.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:李海旭
 * Date : 2023/8/2 11:50
 */
public class UserTest {
    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserDao userBean = context.getBean("userBean", UserDao.class);
        userBean.insert();
    }

    @Test
    public void Test1 (){
        //使用set方法注入
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserService userServiceBean = context.getBean("userServiceBean", UserService.class);
        userServiceBean.saveUser();
    }

    @Test
    public void cust(){
        //使用构造方法注入
        ApplicationContext context = new ClassPathXmlApplicationContext("Application1.xml");
        Custoerervice custBean = context.getBean("custBean", Custoerervice.class);
        custBean.saveAll();
    }
    @Test
    public void stu(){
        //简单类型注入
        ApplicationContext context = new ClassPathXmlApplicationContext("application3.xml");
        Student student = context.getBean(Student.class);
        System.out.println(student.toString());
    }
}
