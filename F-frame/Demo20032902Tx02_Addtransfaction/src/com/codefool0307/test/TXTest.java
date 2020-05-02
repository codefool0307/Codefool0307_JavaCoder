package com.codefool0307.test;

import com.codefool0307.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TXTest {
    @Test
    public void test01(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-config.xml");
        BookService bean = ioc.getBean(BookService.class);
        bean.checkout("Tom","ISBN-001");
        System.out.println("结账成功");
    }

}
