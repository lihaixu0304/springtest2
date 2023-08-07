package com.springtest2.day04.simplefactory;

/**
 * Author:李海旭
 * Date : 2023/8/7 14:11
 */
/*
* 简单工厂
* 生产武器
* */
public class WeaponFactory {
    //生产武器的方法
    public static Weapon get(String weaponType){
        if (weaponType == null || weaponType.trim().length() == 0){
            return null;
        }
        Weapon weapon = null;
        if ("Gun".equals(weaponType)){
            weapon = new Gun();
        }else if ("Ak".equals(weaponType)){
            weapon = new Ak();
        }else {
            throw new RuntimeException("不支持该武器！");
        }
        return weapon;
    }
}
