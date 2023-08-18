package com.springtest.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Author:李海旭
 * Date : 2023/8/18 20:05
 */
@Component("logAspect")
@Aspect//这个是切面的关键标识，不能忘记写
public class LogAspect {//这是一个日志切面
    /*
    * 切面 = 通知 + 切点
    * 以前置通知为例子
    * 切点表达式的格式：[]表示可选的 ()表示必填的
    * execution([访问修饰符可以是*或者public，private，protected,default] (返回值类型) [访问的目标类的全限定路径，可以具体到类.*] (或者类下的具体方法) [形参列表] [异常])
    * */
    @Before("execution(* com.springtest.aop.UserService.*(..))")//括号中编写切点表达式,意思就是写清楚前置通知在那个类或者类下具体方法前生效
    public void strong(){
        System.out.println("前置通知生效了。。。");
    }


}
