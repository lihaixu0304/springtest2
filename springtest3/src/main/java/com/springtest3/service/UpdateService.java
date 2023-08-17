package com.springtest3.service;

import com.springtest3.dao.UpdateDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * Author:李海旭
 * Date : 2023/8/17 16:22
 */
@Service("updateService")
public class UpdateService {
    @Resource
    private UpdateDao updateDao;
    public void updateMessage(){
        updateDao.update();
    }
}
