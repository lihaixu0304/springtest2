package com.springtest2.test;

import com.springtest2.day01.dao.Cat;
import com.springtest2.day01.dao.Dog;
import com.springtest2.day01.dao.Student;
import com.springtest2.day01.dao.UserDao;
import com.springtest2.day01.service.Custoerervice;
import com.springtest2.day01.service.UserService;
import com.springtest2.day02.Foods;
import com.springtest2.day02.Phone;
import com.springtest2.day02.Smell;
import com.springtest2.day02.Story;
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
    /*
    * p名称空间
    * 必须提供set方法
    * */
    @Test
    public void dog(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-p.xml");
        Dog dogBean = context.getBean("dogBean", Dog.class);
        System.out.println(dogBean.toString());
    }
    /*
    * c名称空间，必须提供构造方法
    * */
    @Test
    public void cat(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-c.xml");
        Cat catBean = context.getBean("catBean", Cat.class);
        System.out.println(catBean);
    }
    /*
    * array数组注入
    * */
    @Test
    public void foods(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-array.xml");
        Foods foodsBean = context.getBean("foodsBean", Foods.class);
        System.out.println(foodsBean);
    }
    @Test
    public void phone(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-list.xml");
        Phone phoneBean = context.getBean("phoneBean", Phone.class);
        System.out.println(phoneBean);
    }
    @Test
    public void story(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-set.xml");
        Story storyBean = context.getBean("storyBean", Story.class);
        System.out.println(storyBean);
    }
    @Test
    public void smell(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-map.xml");
        Smell smellBean = context.getBean("smellBean", Smell.class);
        System.out.println(smellBean);
    }
}

