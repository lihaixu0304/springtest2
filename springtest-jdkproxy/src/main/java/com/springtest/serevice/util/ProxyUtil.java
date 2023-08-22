package com.springtest.serevice.util;

import com.springtest.serevice.TimerHandler;
import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;

/**
 * Author:李海旭
 * Date : 2023/8/22 10:22
 */
public class ProxyUtil {//代理工具类
    public  static Object newProxyInstance(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), (Class[]) target.getClass().getInterfaces(), (InvocationHandler) new TimerHandler(target));
    }
}
