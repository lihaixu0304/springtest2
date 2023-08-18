package com.springtest.dynamicproxy;

import java.lang.annotation.Target;
import java.lang.reflect.Proxy;

/**
 * Author:李海旭
 * Date : 2023/8/18 14:52
 */
public class ProxyUtil {
    /*
    * 动态代理工具类
    * */
    public static Object newProxyIntance(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),new TimerInvocationHandler(target));
    }
}
