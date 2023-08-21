package com.springtest.aop02;

import org.springframework.stereotype.Service;

/**
 * Author:李海旭
 * Date : 2023/8/21 16:37
 */
@Service("ellService")
public class EllService {
    public void sleep(){
        System.out.println("睡觉");
    }
}
