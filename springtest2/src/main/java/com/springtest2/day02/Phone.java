package com.springtest2.day02;

import java.util.List;

/**
 * Author:李海旭
 * Date : 2023/8/4 12:18
 */
public class Phone {
    private List<String> names;

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "names=" + names +
                '}';
    }
}
