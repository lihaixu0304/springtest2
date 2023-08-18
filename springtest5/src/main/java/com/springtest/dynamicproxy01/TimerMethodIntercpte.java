package com.springtest.dynamicproxy01;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Author:李海旭
 * Date : 2023/8/18 16:45
 */
public class TimerMethodIntercpte implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        long start = System.currentTimeMillis();
        //调用目标
        Object invokeSuper = proxy.invokeSuper(obj, args);
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end - start)+"ms");
        //必须返回调用的对象
        return invokeSuper;
    }
}
