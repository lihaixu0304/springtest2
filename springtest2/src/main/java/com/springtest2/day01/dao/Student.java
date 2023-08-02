package com.springtest2.day01.dao;

/**
 * Author:李海旭
 * Date : 2023/8/2 16:14
 */
public class Student {
    private String name;
    private String age;
    private Integer money;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", money=" + money +
                '}';
    }
}
