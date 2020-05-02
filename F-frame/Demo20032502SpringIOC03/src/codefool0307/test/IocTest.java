package codefool0307.test;


import codefool0307.bean.Person;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class IocTest {
    ConfigurableApplicationContext ioc =
            new ClassPathXmlApplicationContext("spring-config2.xml");

    @Test
    public void test13() {
        Object car = ioc.getBean("car");
        System.out.println(car);
    }

    @Test
    public void test12() throws SQLException {
        DataSource bean = ioc.getBean(DataSource.class);
        System.out.println(bean.getConnection());
    }
}
