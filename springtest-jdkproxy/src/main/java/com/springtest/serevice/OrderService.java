package com.springtest.serevice;

/**
 * Author:李海旭
 * Date : 2023/8/22 9:24
 */
public interface OrderService {
    /*
    * 生成订单
    * */
    void generate();
    /*
    * 查看订单
    * */
    void detail();
    /*
    * 修改订单
    * */
    void modify();
}
