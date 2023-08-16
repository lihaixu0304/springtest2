package com.springtest2.day09;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Author:李海旭
 * Date : 2023/8/16 15:44
 */
@Component
public class DiWay2 {
    /*
    * 使用@Value注解的注入简单类型的方式二:在set方法上注入
    * */
    private String name;
    private Integer age;
    private String sex;

    @Value("站三")
    public void setName(String name) {
        this.name = name;
    }
    @Value("24")
    public void setAge(Integer age) {
        this.age = age;
    }
    @Value("女")
    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "DiWay1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
