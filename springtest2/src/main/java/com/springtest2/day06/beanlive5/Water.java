package com.springtest2.day06.beanlive5;

/**
 * Author:李海旭
 * Date : 2023/8/10 14:26
 */
public class Water {
    private String name;
/*
* bean的实例化五步法
* */
    public Water(String name) {
        this.name = name;
    }

    public Water() {
        System.out.println("第一步：bean实例化");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步：bean的属性赋值");
    }

    public void initBean(){
        System.out.println("第三步：初始化bean");
    }

    public void destoryBean(){
        System.out.println("第五步：销毁bean");
    }

    @Override
    public String toString() {
        return "Water{" +
                "name='" + name + '\'' +
                '}';
    }
}
