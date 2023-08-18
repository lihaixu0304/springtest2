package com.springtest.aop;

import org.springframework.stereotype.Service;

/**
 * Author:李海旭
 * Date : 2023/8/18 19:58
 */
@Service("userService")
public class UserService {
    /*
    * aop，方式一：注解开发
    * */

    /*
    * login
    * */
    public void login(){
        System.out.println("我得登录了。。。");
    }
    /*
    * logout
    * */
    public void logout(){
        System.out.println("我要退出了。。。");
    }

}
