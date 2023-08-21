package com.springtest.aop;

import com.springtest.aop01.TigerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
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
}
