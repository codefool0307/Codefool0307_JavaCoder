import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Human{
    String getBelief();

    void est(String food);
}
//被代理类
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "life";
    }

    @Override
    public void est(String food) {
        System.out.println("我喜欢吃"+food);
    }
}
   //代理类要解决的问题
class proxyFactory{
    //问题一解决方案创建一个方法，返回创建的代理类对象
       public static Object getProxyInstance(Object obj){
           MyInvocatinHamdler handler = new MyInvocatinHamdler();
           handler.bind(obj);
           return Proxy.newProxyInstance
                   (obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
       }
   }
//问题二解决调用被代理类的同名方法
class MyInvocatinHamdler implements InvocationHandler{

    private Object obj;

    public void bind(Object obj){
        this.obj=obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnValue = method.invoke(obj, args);
        return returnValue;
    }
}

public class proxy01 {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        Human proxyInstance = (Human) proxyFactory.getProxyInstance(superMan);
        proxyInstance.est("大米");
        String belief = proxyInstance.getBelief();
        System.out.println(belief);
    }
}
