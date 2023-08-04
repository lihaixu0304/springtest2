package com.springtest2.day02.service;

import com.springtest2.day02.dao.UserDao;

/**
 * Author:李海旭
 * Date : 2023/8/4 16:26
 */
public class UserDaoImpl {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "userDao=" + userDao +
                '}';
    }
    public void insertAccept(){
        userDao.insert();
    }
}
