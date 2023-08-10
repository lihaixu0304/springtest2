package com.springtest2.day06.beanlive7;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Author:李海旭
 * Date : 2023/8/10 15:02
 */
public class Log implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean后处理器，before方法执行，开始初始化bean");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean后处理器，after方法执行，bean初始化完成");
        return bean;
    }

}
