package com.springtest.serevice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Author:李海旭
 * Date : 2023/8/22 10:07
 */
public class TimerHandler implements InvocationHandler {
    /*
    * 目标对象哪里来的，需要我们自己使用构造方法引入
    * */
    private Object target;

    public TimerHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       /*
       * 参数解读
       * Object proxy 代理对象
       * Method method 目标方法
       *  Object[] args 目标方法需要的参数
       * */

        long start = System.currentTimeMillis();
        //调用目标对象的目标方法
        Object invoke = method.invoke(target, args);

        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end - start)+"ms");
        //一定要返回目标对象
        return invoke;
    }
}
