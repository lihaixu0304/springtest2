package com.springtest.aop;

import com.springtest.aop01.TigerService;
import com.springtest.aop02.EllService;
import com.springtest.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:李海旭
 * Date : 2023/8/18 20:46
 */
public class Aop {
    @Test
    public void aop01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-aop.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.login();
        userService.logout();
    }

    @Test
    public void aop02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-aop.xml");
        TigerService tigerService = context.getBean("tigerService", TigerService.class);
        tigerService.eat();
    }
    /*
    *
    * 最终通知@After
    * */
    @Test
    public void aop03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-aop.xml");
        EllService ellService = context.getBean("ellService", EllService.class);
        ellService.sleep();
    }

    /*
    * 无需xml配置的纯注解式开发
    * */
    @Test
    public void noXml(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        EllService ellService = context.getBean("ellService", EllService.class);
        ellService.sleep();
    }
}
