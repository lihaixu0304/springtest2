package com.springtest2.day01.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.event.WindowAdapter;

/**
 * Author:李海旭
 * Date : 2023/8/2 10:54
 */
public class UserDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    //保存用户信息的方法
    public void insert(){
      logger.info("保存用户信息");
    }
}
