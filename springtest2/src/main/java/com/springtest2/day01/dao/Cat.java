package com.springtest2.day01.dao;

/**
 * Author:李海旭
 * Date : 2023/8/4 11:46
 */
public class Cat {
    /*
    * c名称空间，必须提供构造方法
    * */
    private String name;
    private Double money;
    private Integer monkey;

    public Cat(String name, Double money, Integer monkey) {
        this.name = name;
        this.money = money;
        this.monkey = monkey;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public void setMonkey(Integer monkey) {
        this.monkey = monkey;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", monkey=" + monkey +
                '}';
    }
}
