package com.springtest.dynamicproxy01;

import org.springframework.cglib.proxy.Enhancer;

/**
 * Author:李海旭
 * Date : 2023/8/18 16:34
 */
public class Client01 {
    public static void main(String[] args) {
        /*
         * CGLIB动态代理测试
         * */
        //创建字节码生成器
        Enhancer enhancer = new Enhancer();
        //告诉cglib要继承成的类
        enhancer.setSuperclass(UserService.class);
        //设置回调接口
        enhancer.setCallback(new TimerMethodIntercpte());
        //生成源码，编译class，并加载到JVM对象中，生成代理对象
        UserService userservice =(UserService) enhancer.create();
        //代理对象调用方法
        userservice.login();
        userservice.logout();

    }
}
