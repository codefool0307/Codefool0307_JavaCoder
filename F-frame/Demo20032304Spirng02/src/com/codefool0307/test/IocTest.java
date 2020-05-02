package com.codefool0307.test;


import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class IocTest {
    ConfigurableApplicationContext ioc =
            new ClassPathXmlApplicationContext("spring-config.xml");
    @Test
    public void test10(){
       Object book01 = ioc.getBean("book01");
       System.out.println(book01);
       System.out.println("容器关闭了");
    }
}
