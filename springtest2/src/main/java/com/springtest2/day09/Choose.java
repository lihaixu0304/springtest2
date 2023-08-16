package com.springtest2.day09;

import com.springtest2.day08.Componet;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Author:李海旭
 * Date : 2023/8/16 14:37
 */
@Component
public class Choose {
    class A{
        public A() {

            System.out.println("A的构造方法生效");
        }
    }
    @Controller
    class B{
        public B() {
            System.out.println("B的构造方法生效");
        }
    }
    @Service
    class C{
        public C() {
            System.out.println("C的构造方法生效");
        }
    }
    @Repository
    class D{
        public D() {
            System.out.println("D的构造方法生效");
        }
    }
    @Controller
    class E {
        public E(){
            System.out.println("E的构造方法生效");
        }
    }
}
