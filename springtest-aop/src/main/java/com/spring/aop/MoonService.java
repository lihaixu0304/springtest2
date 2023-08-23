package com.spring.aop;

import org.springframework.stereotype.Service;

/**
 * @Author lihaixu
 * @Date 2023/8/23 14:35
 */
@Service("moonService")
public class MoonService {
    public void add(){
        System.out.println("加入购物车。。。");
    }
}
