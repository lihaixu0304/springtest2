package com.springtest2.day01.service;

import com.springtest2.day01.dao.UserDao;

/**
 * Author:李海旭
 * Date : 2023/8/2 11:43
 */
public class UserService {
    //set方法注入，让UserDao生效
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;
     public void saveUser(){
         userDao.insert();
     }
}
