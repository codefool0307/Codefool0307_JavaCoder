package com.codefool0307.test;
import com.codefool0307.Service.CarServiceEXT;
import com.codefool0307.Servlet.CarServlet;
import com.codefool0307.Servlet.CarServlet2;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {
    ConfigurableApplicationContext ioc =
            new ClassPathXmlApplicationContext("spring-config3.xml");
    @Test
    public void test20() {

    }

    @Test
    public void test19() {
        CarServlet2 bean = ioc.getBean(CarServlet2.class);
        System.out.println(bean);
    }
    @Test
    public void test18() {
        CarServlet bean = ioc.getBean(CarServlet.class);
        bean.doGet();
    }
}
