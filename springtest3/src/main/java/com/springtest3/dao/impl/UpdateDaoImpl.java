package com.springtest3.dao.impl;

import com.springtest3.dao.UpdateDao;
import org.springframework.stereotype.Component;

/**
 * Author:李海旭
 * Date : 2023/8/17 16:21
 */
@Component("updateDaoImpl")
public class UpdateDaoImpl implements UpdateDao {
    @Override
    public void update() {
        System.out.println("更新了信息！");
    }
}
