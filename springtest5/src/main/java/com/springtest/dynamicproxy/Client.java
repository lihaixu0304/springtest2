package com.springtest.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Author:李海旭
 * Date : 2023/8/18 14:18
 */
public class Client {
    public static void main(String[] args) {
        //目标对象
        OrderService  target = new OrderServiceImpl();
        //代理对象
        OrderService orderService = (OrderService) ProxyUtil.newProxyIntance(target);
        //调用代理对象的方法
        orderService.addOrder();
        orderService.deleteOrder();
        orderService.selectOrder();
        orderService.updateOrder();
    }
}
