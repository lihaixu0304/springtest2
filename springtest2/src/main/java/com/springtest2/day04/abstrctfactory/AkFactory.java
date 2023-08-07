package com.springtest2.day04.abstrctfactory;

/**
 * Author:李海旭
 * Date : 2023/8/7 14:40
 */
public class AkFactory implements WeaPonFactory{//ak工厂生产步枪
    @Override
    public WeaPon get() {
        return new M416();
    }
}
