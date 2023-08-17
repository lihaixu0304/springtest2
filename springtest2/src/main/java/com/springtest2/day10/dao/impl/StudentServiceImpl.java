package com.springtest2.day10.dao.impl;

import com.springtest2.day10.dao.StudentDao;
import org.springframework.stereotype.Component;

/**
 * Author:李海旭
 * Date : 2023/8/17 15:00
 */
@Component("studentServiceImpl")
public class StudentServiceImpl implements StudentDao {
    @Override
    public void insert() {
        System.out.println("正在删除学生信息！");
    }
}
