package com.spring.service;

import org.springframework.cglib.proxy.MethodInterceptor;

import java.lang.reflect.Method;

/**
 * Author:李海旭
 * Date : 2023/8/22 10:47
 */
public class MethodProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, org.springframework.cglib.proxy.MethodProxy proxy) throws Throwable {
        /*
         * 参数解释
         * Object o,目标对象
         * Method method, 目标方法
         * Object[] objects,目标方法的参数
         * net.sf.cglib.proxy.MethodProxy methodProxy代理方法
         * */
        long start = System.currentTimeMillis();
        //代理方法调用方法invokeSuper，参数为(目标对象和目标参数)
        Object invokeSuper = proxy.invokeSuper(obj, args);
        long end = System.currentTimeMillis();
        System.out.println("消耗的时间为："+(end - start)+"ms");
        //返回调用的对象
        return invokeSuper;
    }
}
