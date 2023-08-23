package com.spring.test;

import com.spring.aop.MoonService;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @Author lihaixu
 * @Date 2023/8/23 16:37
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:application-aop.xml")
public class AopJunit5 {

    @Autowired
    private MoonService moonService;

    @Test
    public void junit5(){
        moonService.add();
    }
}
