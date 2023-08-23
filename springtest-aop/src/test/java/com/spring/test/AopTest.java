package com.spring.test;

import com.spring.aop.MoonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author lihaixu
 * @Date 2023/8/23 14:48
 */
public class AopTest {
    @Test
    public void before(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-aop.xml");
        MoonService moonService = context.getBean("moonService", MoonService.class);
        moonService.add();
    }
}
