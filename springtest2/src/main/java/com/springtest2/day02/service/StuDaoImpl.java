package com.springtest2.day02.service;

import com.springtest2.day02.dao.StuDao;

/**
 * Author:李海旭
 * Date : 2023/8/4 16:37
 */
public class StuDaoImpl {
    private StuDao stuDao;

    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }
    public void stuDaoInsert(){
        stuDao.stuInsert();
    }

    @Override
    public String toString() {
        return "StuDaoImpl{" +
                "stuDao=" + stuDao +
                '}';
    }
}
