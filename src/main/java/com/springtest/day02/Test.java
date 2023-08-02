package com.springtest.day02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:李海旭
 * Date : 2023/7/26 10:27
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application01.xml");
        SportStudent sp = context.getBean(SportStudent.class);
        sp.eat();
        ArtStudent at = context.getBean(ArtStudent.class);
        at.art();
        //使用别名
        ArtStudent art = (ArtStudent) context.getBean("art");
        art.open();
    }
}
