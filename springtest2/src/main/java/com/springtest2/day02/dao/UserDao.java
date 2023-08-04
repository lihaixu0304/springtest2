package com.springtest2.day02.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author:李海旭
 * Date : 2023/8/4 16:24
 */
public class UserDao {
    Logger logger = LoggerFactory.getLogger(UserDao.class);
    /*
    添加用户的方法
     */
    public void insert(){
        logger.info("添加用户的方法");
    }
}
