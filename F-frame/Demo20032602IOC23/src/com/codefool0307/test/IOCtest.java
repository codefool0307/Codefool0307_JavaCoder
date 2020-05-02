package com.codefool0307.test;

import com.codefool0307.Service.BookService;
import com.codefool0307.Service.UserService;
import jdk.nashorn.internal.ir.CallNode;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCtest {
     @Test
    public void test01(){
        ClassPathXmlApplicationContext ioc =
                new ClassPathXmlApplicationContext("spring-config3.xml");
        BookService a = ioc.getBean(BookService.class);
        UserService b = ioc.getBean(UserService.class);
        a.save();
        b.save();
    }
}
