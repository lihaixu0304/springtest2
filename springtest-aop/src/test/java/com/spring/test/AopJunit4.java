package com.spring.test;

import com.spring.aop.MoonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author lihaixu
 * @Date 2023/8/23 16:32
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-aop.xml")
public class AopJunit4 {
    @Autowired
    private MoonService moonService;

    @Test
    public void junit4(){
        moonService.add();
    }
}
