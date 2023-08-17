package com.springtest2.day10.service;

import com.springtest2.day10.dao.StudentDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * Author:李海旭
 * Date : 2023/8/17 15:55
 */
@Service("studentService")
public class StudentService {
    @Resource(name = "studentServiceImpl")
    private StudentDao studentDao;

    public void deleteStudent(){
        studentDao.insert();
    }
}
