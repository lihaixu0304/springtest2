package com.springtest.dynamicproxy;

/**
 * Author:李海旭
 * Date : 2023/8/17 19:15
 */
public interface OrderService {
    /*
    * 添加订单的方法
    * */
    void addOrder();
    /*
    * 查询订单的接口
    * */
    void selectOrder();
    /*
    *删除订单的接口
    * */
    void deleteOrder();
    /*
    * 更新订单的接口
    * */
    void updateOrder();
}
