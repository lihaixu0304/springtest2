package com.springtest2.day06.beanlive10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * Author:李海旭
 * Date : 2023/8/10 15:19
 */
public class Flower implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {//bean生命周期10步法，实现多个接口
    private String name;

    public Flower() {
        System.out.println("1，实例化bean");
    }

    public Flower(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2,bean属性赋值");
    }
    public void initBean(){
        System.out.println("6，初始化bean");
    }

    public void destoryBean(){
        System.out.println("10销毁bean");
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                '}';

    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("3,类加载器："+classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("3，bean工厂:"+beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("3,bean名字："+name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("9,diDisposableBean destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("5.afterPropertiesSet执行");
    }
}
