package com.springtest.aop01;

import org.springframework.stereotype.Service;

/**
 * Author:李海旭
 * Date : 2023/8/21 15:54
 */
@Service("tigerService")
public class TigerService {
    public void eat(){
        System.out.println("老虎吃肉！！");
    }
}
