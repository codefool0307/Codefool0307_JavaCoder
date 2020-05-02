package com.codefool.test;

import com.codefool.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
    private ApplicationContext ioc =
            new ClassPathXmlApplicationContext("spring-config.xml");
    @Test
    public void test09(){
        Object car = ioc.getBean("car02");
        System.out.println(car);

        Object car03 = ioc.getBean("car03");
        System.out.println(car03);

        Object factory = ioc.getBean("factory");
        System.out.println(factory);
    }



    @Test
    public void test08(){
        Object car = ioc.getBean("car");
        System.out.println(car);
    }

    @Test
    public void test06(){
        Object person06 = ioc.getBean("person06");
        System.out.println(person06);
        Object person07 = ioc.getBean("person07");
        System.out.println(person07);
    }




    @Test
    public void test03(){
        Object person03 = ioc.getBean("person03");
        System.out.println(person03);

        //补充2——index指定
        Object person04 = ioc.getBean("person04");
        System.out.println(person04);

        //补充3——type
        Object person05 = ioc.getBean("person05");
        System.out.println(person05);
    }


    @Test
    public void test02(){
        Person person02 = ioc.getBean("person02", Person.class);
        System.out.println(person02);
    }

    @Test
    public void test00(){
     //1.根据配置文件得到ioc对象
        //2.容器创建对象
        Person person = (Person) ioc.getBean("person");
        //z
        System.out.println(person);
    }
}
