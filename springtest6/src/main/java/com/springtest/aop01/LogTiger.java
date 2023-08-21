package com.springtest.aop01;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Author:李海旭
 * Date : 2023/8/21 15:56
 */
@Component("logTiger")
@Aspect
public class LogTiger {
    /*
    * 后置通知
    * @After
    * */
    @AfterReturning("execution(* com.springtest.aop01.TigerService..*(..))")
    public void wash(){
        System.out.println("吃完肉要刷牙！！！");
    }
}
