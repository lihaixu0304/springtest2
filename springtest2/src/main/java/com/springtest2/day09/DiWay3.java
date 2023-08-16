package com.springtest2.day09;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Author:李海旭
 * Date : 2023/8/16 15:44
 */
@Component
public class DiWay3 {
    /*
    * 使用@Value注解的注入简单类型的方式三:在有参构造方法上注入
    * */
    private String name;
    private Integer age;
    private String sex;

    public DiWay3(@Value("丽丽") String name,@Value("24") Integer age,@Value("女") String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /* public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }*/

    @Override
    public String toString() {
        return "DiWay1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
