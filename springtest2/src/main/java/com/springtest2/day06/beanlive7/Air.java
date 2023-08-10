package com.springtest2.day06.beanlive7;

/**
 * Author:李海旭
 * Date : 2023/8/10 14:54
 */
public class Air {
    private String name;

    public Air() {
        System.out.println("1，实例化bean");
    }

    public Air(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2,bean属性赋值");
    }

    public void initBean(){
        System.out.println("3，初始化bean");
    }

    public void destoryBean(){
        System.out.println("5，销毁bean");
    }

    @Override
    public String toString() {
        return "Air{" +
                "name='" + name + '\'' +
                '}';
    }
}
