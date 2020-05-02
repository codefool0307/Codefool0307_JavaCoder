package com.codefool.factory;
import com.codefool.bean.Car;
import org.springframework.beans.factory.FactoryBean;
import java.util.UUID;
public class MyFactorybean implements FactoryBean {

    /**
     * getObject：工厂方法；
     * 		返回创建的对象
     */
    @Override
    public Car getObject() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("MyFactoryBeanImple。。帮你创建对象...");
        Car book = new Car();
        book.setCarName(UUID.randomUUID().toString());
        return book;
    }

    /**
     * 返回创建的对象的类型；
     * Spring会自动调用这个方法来确认创建的对象是什么类型
     */
    @Override
    public Class<?> getObjectType() {
        // TODO Auto-generated method stub
        return Car.class;
    }

    /**
     * isSingleton：是单例？
     * false：不是单例
     * true：是单例
     */
    @Override
    public boolean isSingleton() {
        // TODO Auto-generated method stub
        return true;
    }
}
