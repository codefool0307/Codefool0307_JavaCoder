package com.codefool0307.test;

import com.codefool0307.inter.Caculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPtest {
    @Test
    public void test(){
        ApplicationContext ios =
                new ClassPathXmlApplicationContext("spring-config3.xml");
        Caculator bean = ios.getBean(Caculator.class);
        bean.add(3,4);
    }
}
