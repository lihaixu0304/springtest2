package com.springtest2.day01.service;

import com.springtest2.day01.dao.UserDao;
import com.springtest2.day01.dao.VipDao;

/**
 * Author:李海旭
 * Date : 2023/8/2 14:56
 */
public class Custoerervice {
    /*使用构造方法注入*/
    private UserDao userDao;
    private VipDao vipDao;

    public Custoerervice(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }
    public void saveAll(){
        userDao.insert();
        vipDao.save();
    }
}
