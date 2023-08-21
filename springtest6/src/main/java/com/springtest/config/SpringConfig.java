package com.springtest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Author:李海旭
 * Date : 2023/8/21 17:06
 */
@Configuration
//包扫描
@ComponentScan({"com.springtest"})
//开启自动代理
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
