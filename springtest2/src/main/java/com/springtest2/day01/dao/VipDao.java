package com.springtest2.day01.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author:李海旭
 * Date : 2023/8/2 14:54
 */
public class VipDao {
    private static  final Logger logger = LoggerFactory.getLogger(VipDao.class);
    public void save(){
        logger.info("正在保存VIP信息。。。");
    }
}
