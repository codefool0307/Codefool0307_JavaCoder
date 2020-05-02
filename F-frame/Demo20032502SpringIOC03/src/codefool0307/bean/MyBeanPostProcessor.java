package codefool0307.bean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanname)
            throws BeansException {
        System.out.println("["+beanname+"]bean将要调用初始化方法这个bean是["+bean+"]");
        //返回传入的bean
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanname)
            throws BeansException {
        System.out.println("["+beanname+"]bean将要初始化方法已经结束了这个bean是["+bean+"]");
        //初始化之后返回的bean，返回的是什么，容器中保存的就是什么
        return bean;
    }
}
