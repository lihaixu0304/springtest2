package com.springtest.aop;

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
}
