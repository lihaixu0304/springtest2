package com.springtest.aop02;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Author:李海旭
 * Date : 2023/8/21 16:32
 */
@Component("afterAdvice")
@Aspect
public class AfterAdvice {
    /*
    * Z最终通知
    * @After
    * */
    @After("execution(* com.springtest.aop02..*(..))")
    public void after(){
        System.out.println("睡觉之后做梦！");
    }
}
