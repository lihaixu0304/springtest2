package com.spring.staticproxy;

/**
 * Author:李海旭
 * Date : 2023/8/17 19:16
 */
public class Client {
    public static void main(String[] args) {
        //目标对象
        OrderService target = new OrderServiceImpl();
        //代理对象，将目标对象target交给代理对象
        OrderService order = new ProxyOrder(target);
        order.addOrder();
        order.selectOrder();
        order.deleteOrder();
        order.updateOrder();
    }
}
