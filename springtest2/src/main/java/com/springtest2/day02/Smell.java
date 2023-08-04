package com.springtest2.day02;

import java.util.Map;

/**
 * Author:李海旭
 * Date : 2023/8/4 13:54
 */
public class Smell {
    private Map<Integer,String> address;

    public void setAddress(Map<Integer, String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Smell{" +
                "address=" + address +
                '}';
    }
}
