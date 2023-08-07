package com.springtest2.day05.beanway2;

/**
 * Author:李海旭
 * Date : 2023/8/7 15:06
 */
/*
* 通过简单工厂中的工厂方法实例化bean
* */
public class BankFactory {
    //工厂方法get(),返回值为具体的产品Bank();
    public static Bank get(){
        return new Bank();
    }
}
