package com.springtest2.day01.dao;

/**
 * Author:李海旭
 * Date : 2023/8/4 11:40
 */
public class Dog {
/*
*p名称空间
*必须提供set方法
* */    private String name;
    private String sex;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
