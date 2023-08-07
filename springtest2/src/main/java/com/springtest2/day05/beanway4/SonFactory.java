package com.springtest2.day05.beanway4;

import org.springframework.beans.factory.FactoryBean;

/**
 * Author:李海旭
 * Date : 2023/8/7 15:38
 */
public class SonFactory implements FactoryBean<Son> {
    /*
    * bean的实例化方式4，通过你想实例化的类实现FactoryBean接口
    * 实现了上面的接口在配置文件中就不需要指定factory-bean和factory-method
    * */
    @Override
    public Son getObject() throws Exception {
        return new Son();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
