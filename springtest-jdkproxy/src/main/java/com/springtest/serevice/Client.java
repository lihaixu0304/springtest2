package com.springtest.serevice;

import com.springtest.serevice.impl.OrderServiceImpl;

import java.lang.reflect.Proxy;

/**
 * Author:李海旭
 * Date : 2023/8/22 9:30
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        OrderService target = new OrderServiceImpl();
        //创建代理对象
        OrderService orderServiceProxy = (OrderService) Proxy.newProxyInstance(target.getClass().getClassLoader() ,target.getClass().getInterfaces(),new TimerHandler(target));
        //调用代理对象的代理方法
        orderServiceProxy.detail();
        orderServiceProxy.generate();
        orderServiceProxy.modify();
    }
}
