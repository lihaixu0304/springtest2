package com.springtest.aop02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Author:李海旭
 * Date : 2023/8/21 16:16
 */
@Component("aroundAdvice")
@Aspect
public class AroundAdvice {
    @Around("execution(* com.springtest.aop01.TigerService..*(..))")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("前环绕");
        //执行目标
        joinPoint.proceed();
        System.out.println("后环绕");
    }
}
