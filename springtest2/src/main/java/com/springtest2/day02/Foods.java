package com.springtest2.day02;

import java.util.Arrays;

/**
 * Author:李海旭
 * Date : 2023/8/4 11:57
 */
public class Foods {
    private String[] name;
    private String[] taste;
    private Integer[] money;

    public Foods() {
    }

    public Foods(String[] name, String[] taste, Integer[] money) {
        this.name = name;
        this.taste = taste;
        this.money = money;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public void setTaste(String[] taste) {
        this.taste = taste;
    }

    public void setMoney(Integer[] money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Foods{" +
                "name=" + Arrays.toString(name) +
                ", taste=" + Arrays.toString(taste) +
                ", money=" + Arrays.toString(money) +
                '}';
    }
}
