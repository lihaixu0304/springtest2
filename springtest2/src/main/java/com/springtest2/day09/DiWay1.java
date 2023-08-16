package com.springtest2.day09;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Author:李海旭
 * Date : 2023/8/16 15:44
 */
@Component
public class DiWay1 {
    /*
    * 使用@Value注解的注入简单类型的方式一:在属性上注入，可以省略set方法
    * */
    @Value("李海旭")
    private String name;
    @Value(value = "24")
    private Integer age;
    @Value(value = "男")
    private String sex;

    @Override
    public String toString() {
        return "DiWay1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
