package com.codefool0307.test;
import com.codefool0307.Servlet.CarServlet;
import com.codefool0307.Servlet.CarServlet2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = "classpath:spring-config3.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class IocTest01 {
    @Autowired
      CarServlet carServlet;
    @Test
    public void test(){
        System.out.println(carServlet);
    }

}
