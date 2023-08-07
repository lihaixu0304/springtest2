package com.springtest2.day04.simplefactory;

/**
 * Author:李海旭
 * Date : 2023/8/7 14:08
 */
/*
* 具体的产品角色
* */
public class Gun extends Weapon{
    @Override
    public void attack() {
        System.out.println("狙击枪打靶！");
    }
}
