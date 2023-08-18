package com.springtest.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Author:李海旭
 * Date : 2023/8/18 14:24
 */
public class TimerInvocationHandler implements InvocationHandler {//实现这个接口要注意是jdk反射包下的下的还是spring.CgLab下的接口
    //目标对象
    private Object target;
    //通过目标对象传来构造方法
    public TimerInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        //调用目标对象的目标方法
        Object invoke = method.invoke(target, args);

        long end = System.currentTimeMillis();
        System.out.println("消耗时间为："+(end - start)+"ms");
        return null;

    }
}
