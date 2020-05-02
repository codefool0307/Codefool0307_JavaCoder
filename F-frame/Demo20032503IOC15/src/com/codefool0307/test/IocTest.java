package com.codefool0307.test;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class IocTest {
    ConfigurableApplicationContext ioc =
            new ClassPathXmlApplicationContext("spring-config3.xml");
    @Test
    public void test15() {
        Object bookBean = ioc.getBean("carDao");
        System.out.println(bookBean);
    }
}
