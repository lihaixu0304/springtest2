package com.springtest2.day10.dao;

import org.springframework.stereotype.Repository;

/**
 * Author:李海旭
 * Date : 2023/8/17 15:00
 */
@Repository("studentDao")
public interface StudentDao {
    /*
    * 保存数据的方法
    * */
    void insert();
}
