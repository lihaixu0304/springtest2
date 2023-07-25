package com.springtest.day01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:李海旭
 * Date : 2023/7/25 15:08
 */
public class Test {
    public static void main(String[] args) {
        //容器配置
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        //从容器中拿student对象,不需要自己new
        Student student = context.getBean(Student.class);
        student.open();
        System.out.println(student);
    }
}
