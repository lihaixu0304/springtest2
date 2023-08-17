package com.springtest3.springconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Author:李海旭
 * Date : 2023/8/17 16:17
 */
@Configuration
@ComponentScan({"com.springtest3.dao,com.springtest3.service"})
public class SpringConfig {
}
