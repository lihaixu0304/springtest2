package com.spring.client;

import com.spring.service.MethodProxy;
import com.spring.service.MoonService;
import org.springframework.cglib.proxy.Enhancer;

/**
 * Author:李海旭
 * Date : 2023/8/22 10:39
 */
public class Client {
    public static void main(String[] args) {
        /*
        * 使用cglib在内存中生成MoonService的代理类
        * */
        //创建字节码生成器
        Enhancer enhancer = new Enhancer();
        //告诉cglib要代理的类
        enhancer.setSuperclass(MoonService.class);
        //设置回调接口,重新编写类继承该方法拦截器
        //enhancer.setCallback(方法拦截器);
        enhancer.setCallback(new MethodProxy());
        //创建代理对象
        MoonService moonServiceProxy  = (MoonService) enhancer.create();
        //调用目标方法
        moonServiceProxy.login();
        moonServiceProxy.logout();

    }
}
