package com.springtest2.day05.beanway1;

/**
 * Author:李海旭
 * Date : 2023/8/7 14:56
 */
public class Animal {
    /*
    * bean 的实例化方式一：通过无参构造进行实例化
    * */
    private String name;
    private String age;
    private Integer money;

    public void eat(){
        System.out.println("食肉动物！");
    }
    public Animal() {
    }

    public Animal(String name, String age, Integer money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

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
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", money=" + money +
                '}';
    }
}
