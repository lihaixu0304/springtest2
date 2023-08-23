package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author lihaixu
 * @Date 2023/8/23 14:36
 */
@Component("moonAspect")
@Aspect
public class MoonAspect {
    /*
    * 通知的7大类型
    * 前置通知@Before
    * 后置通知@AfterRound
    * 环绕通知@Around
    * 异常通知@AfterThrowing
    * 最终通知@After
    * */

    @Before("execution(* com.spring.aop.MoonService..*(..))")
    public void before01(){
        System.out.println("挑选商品(前置通知)");
    }

    @AfterReturning("execution(* com.spring.aop.MoonService..*(..))")
    public void afterRound(){
        System.out.println("结算(后置通知)");
    }

    @Around("execution(* com.spring.aop.MoonService..*(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("我开始购物（环绕通知）");
        point.proceed();
        System.out.println("我结束购物（环绕通知）");
    }

    @After("execution(* com.spring.aop.MoonService..*(..))")
    public void after(){
        System.out.println("走出商场");
    }
}
