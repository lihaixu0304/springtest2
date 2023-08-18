package com.springtest.dynamicproxy;

/**
 * Author:李海旭
 * Date : 2023/8/17 19:15
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public void addOrder() {
        System.out.println("添加订单的接口");
    }

    @Override
    public void selectOrder() {
        System.out.println("查询订单的接口");
    }

    @Override
    public void deleteOrder() {
        System.out.println("删除订单的接口");
    }

    @Override
    public void updateOrder() {
        System.out.println("更新订单的接口");
    }
}
