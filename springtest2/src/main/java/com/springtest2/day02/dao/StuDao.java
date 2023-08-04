package com.springtest2.day02.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author:李海旭
 * Date : 2023/8/4 16:34
 */
public class StuDao {
    Logger logger = LoggerFactory.getLogger(StuDao.class);
    public void stuInsert(){
        logger.info("添加学生！");
    }
}
