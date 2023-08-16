package com.springtest2.day08;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author:李海旭
 * Date : 2023/8/16 8:59
 */
@Target(value = {ElementType.TYPE})//元注解,只能出现在类上
@Retention(value = RetentionPolicy.RUNTIME)//元注解，用来标注，用来保存在class文件中，并且被反射机制读取
public @interface Componet {//自定义注解
    String value();
}
