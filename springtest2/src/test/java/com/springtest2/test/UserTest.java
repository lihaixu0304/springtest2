package com.springtest2.test;

import com.springtest2.day01.dao.Cat;
import com.springtest2.day01.dao.Dog;
import com.springtest2.day01.dao.Student;
import com.springtest2.day01.dao.UserDao;
import com.springtest2.day01.service.Custoerervice;
import com.springtest2.day01.service.UserService;
import com.springtest2.day02.Foods;
import com.springtest2.day02.Phone;
import com.springtest2.day02.Smell;
import com.springtest2.day02.Story;
import com.springtest2.day02.service.StuDaoImpl;
import com.springtest2.day03.MyDataSources;
import com.springtest2.day04.abstrctfactory.AkFactory;
import com.springtest2.day04.abstrctfactory.WeaPon;
import com.springtest2.day04.abstrctfactory.WeaPonFactory;
import com.springtest2.day04.simplefactory.Weapon;
import com.springtest2.day04.simplefactory.WeaponFactory;
import com.springtest2.day05.beanway1.Animal;
import com.springtest2.day05.beanway2.Bank;
import com.springtest2.day05.beanway3.Cook;
import com.springtest2.day05.beanway4.Son;
import com.springtest2.day05.beanway4.SonFactory;
import com.springtest2.day06.beanlive10.Flower;
import com.springtest2.day06.beanlive5.Water;
import com.springtest2.day06.beanlive7.Air;
import com.springtest2.day06.manage.Kfc;
import com.springtest2.day09.Choose;
import com.springtest2.day09.DiWay1;
import com.springtest2.day09.DiWay2;
import com.springtest2.day09.DiWay3;
import com.springtest2.day10.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author:李海旭
 * Date : 2023/8/2 11:50
 */
public class UserTest {
    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserDao userBean = context.getBean("userBean", UserDao.class);
        userBean.insert();
    }

    @Test
    public void Test1 (){
        //使用set方法注入
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserService userServiceBean = context.getBean("userServiceBean", UserService.class);
        userServiceBean.saveUser();
    }

    @Test
    public void cust(){
        //使用构造方法注入
        ApplicationContext context = new ClassPathXmlApplicationContext("Application1.xml");
        Custoerervice custBean = context.getBean("custBean", Custoerervice.class);
        custBean.saveAll();
    }
    @Test
    public void stu(){
        //简单类型注入
        ApplicationContext context = new ClassPathXmlApplicationContext("application3.xml");
        Student student = context.getBean(Student.class);
        System.out.println(student.toString());
    }
    /*
    * p名称空间
    * 必须提供set方法
    * */
    @Test
    public void dog(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-p.xml");
        Dog dogBean = context.getBean("dogBean", Dog.class);
        System.out.println(dogBean.toString());
    }
    /*
    * c名称空间，必须提供构造方法
    * */
    @Test
    public void cat(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-c.xml");
        Cat catBean = context.getBean("catBean", Cat.class);
        System.out.println(catBean);
    }
    /*
    * array数组注入
    * */
    @Test
    public void foods(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-array.xml");
        Foods foodsBean = context.getBean("foodsBean", Foods.class);
        System.out.println(foodsBean);
    }
    @Test
    public void phone(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-list.xml");
        Phone phoneBean = context.getBean("phoneBean", Phone.class);
        System.out.println(phoneBean);
    }
    @Test
    public void story(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-set.xml");
        Story storyBean = context.getBean("storyBean", Story.class);
        System.out.println(storyBean);
    }
    @Test
    public void smell(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-map.xml");
        Smell smellBean = context.getBean("smellBean", Smell.class);
        System.out.println(smellBean);
    }
    /*
    * 根据byName名称完成自动注入
    * */
    @Test
    public void byName(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-auto-byname.xml");
        com.springtest2.day02.dao.UserDao userDao = context.getBean("userDao", com.springtest2.day02.dao.UserDao.class);
        userDao.insert();
    }

    @Test
    public void byType(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-auto-bytype.xml");
        StuDaoImpl stuDaoImplBean = context.getBean("stuDaoImplBean", StuDaoImpl.class);
        stuDaoImplBean.stuDaoInsert();
    }
    /*
    * 读取数据库
    * */
    @Test
    public void datasource(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-properties.xml");
        MyDataSources dataSource = context.getBean("dataSource", MyDataSources.class);
        System.out.println(dataSource);
    }

    @Test
    public void weapon(){
        Weapon weapon = WeaponFactory.get("Ak");
        weapon.attack();
    }

    @Test
    public void weapon1(){
        WeaPonFactory weaPonFactory = new AkFactory();
        WeaPon weaPon = weaPonFactory.get();
        weaPon.shoot();
    }
    @Test
    public void beanway1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-beanway1.xml");
        Animal animalBean = context.getBean("animalBean", Animal.class);
        animalBean.eat();
    }

    @Test
    public void beanway2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-beanway2.xml");
        Bank bankBean = context.getBean("bankBean", Bank.class);
        System.out.println(bankBean);
    }

    @Test
    public void beanway3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-beanway3.xml");
        Cook cook= context.getBean("cookBean", Cook.class);
        System.out.println(cook);
    }

    @Test
    public void beanway4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-beanway4.xml");
        Son sonFactory = context.getBean("sonFactory", Son.class);
        System.out.println(sonFactory);
    }

    /*
    * bean的生命周期5步法
    * */
    @Test
    public void beanLive5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-beanlive5.xml");
        Water waterBean = context.getBean("waterBean", Water.class);
        System.out.println("第四步：执行bean");
        ClassPathXmlApplicationContext context1 = (ClassPathXmlApplicationContext) context;
        context1.close();
    }
/*
* bean的生命周期7步法
* */
    @Test
    public void beanLive7(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-beanlive7.xml");
        Air airBean = context.getBean("airBean", Air.class);
        System.out.println("4，执行bean");
        ClassPathXmlApplicationContext context1 = (ClassPathXmlApplicationContext) context;
        context1.close();
    }
    /*
    * bean的生命周期10步法
    * */
    @Test
    public void beanLive10(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-beanlive10.xml");
        Flower flowerBean = context.getBean("flowerBean", Flower.class);
        System.out.println("8,执行bean");
        ClassPathXmlApplicationContext context1 = (ClassPathXmlApplicationContext) context;
        context1.close();
    }

    /*
    * 让bean管理自己创建的对象
    * */
    @Test
    public void manageObject(){
        //创建对象
        Kfc kfc = new Kfc();
        System.out.println(kfc);
        //创建默认列表的bean工厂
        DefaultListableBeanFactory dlbf = new DefaultListableBeanFactory();
        //注册bean
        dlbf.registerSingleton("kfcBean",kfc);
        //获取bean
        Kfc kfcBean = dlbf.getBean("kfcBean", Kfc.class);
        System.out.println(kfcBean);
    }
    /*
    * 选择实例化
    * */
    @Test
    public void choose() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-choose.xml");
    }
    /*
    * @Value注解注入简单类型值的方式一
    * */
    @Test
    public void DiWay01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-di01.xml");
        DiWay1 diWay01 = context.getBean("diWay1", DiWay1.class);
        System.out.println(diWay01);
    }
    /*
    * @Value注解注入简单类型值的方式二
    * */
    @Test
    public void DiWay02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-di01.xml");
        DiWay2 diWay02 = context.getBean("diWay2", DiWay2.class);
        System.out.println(diWay02);
    }
    /*
    * @Value注解注入简单类型值的方式三
    * */
    @Test
    public void DiWay03() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-di01.xml");
        DiWay3 diWay03 = context.getBean("diWay3", DiWay3.class);
        System.out.println(diWay03);
    }
    /*
    * @Resources注解的使用
    * */
    @Test
    public void resources(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-resources.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.deleteStudent();
    }

}

