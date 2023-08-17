package com.spring.staticproxy;

/**
 * Author:李海旭
 * Date : 2023/8/17 19:21
 */
//静态代理对象，实现公共接口
public class ProxyOrder implements OrderService {
    //将目标对象作为代理对象的一个属性，比继承的耦合度更低，这关系叫哦关联关系
    private OrderService orderService;
    //通过构造方法，将目标对象传递给代理对象


    public ProxyOrder(OrderService orderService) {
        this.orderService = orderService;
    }

    /*
     * 需求：统计每个订单生成的时间
     * */
    @Override
    public void addOrder() {
        long start = System.currentTimeMillis();
        orderService.addOrder();
        long end = System.currentTimeMillis();
        System.out.println("耗时:"+(end - start)+"ms");
    }

    @Override
    public void selectOrder() {
        long start = System.currentTimeMillis();
        orderService.selectOrder();
        long end = System.currentTimeMillis();
        System.out.println("耗时:"+(end - start)+"ms");
    }

    @Override
    public void deleteOrder() {
        long start = System.currentTimeMillis();
        orderService.deleteOrder();
        long end = System.currentTimeMillis();
        System.out.println("耗时:"+(end - start)+"ms");
    }

    @Override
    public void updateOrder() {
        long start = System.currentTimeMillis();
        orderService.updateOrder();
        long end = System.currentTimeMillis();
        System.out.println("耗时:"+(end - start)+"ms");
    }



}
