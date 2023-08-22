package com.springtest.serevice.impl;

import com.springtest.serevice.OrderService;

/**
 * Author:李海旭
 * Date : 2023/8/22 9:26
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public void generate() {
        try {
            Thread.sleep(1223);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("订单正在生成。。");
    }

    @Override
    public void detail() {
        try {
            Thread.sleep(1111);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("订单数量太多了");
    }


    @Override
    public void modify() {
        try {
            Thread.sleep(999);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("修改订单");
    }
}
