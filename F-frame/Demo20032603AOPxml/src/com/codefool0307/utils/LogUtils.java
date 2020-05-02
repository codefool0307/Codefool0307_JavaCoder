package com.codefool0307.utils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogUtils {
    @Pointcut("execution(public int com.codefool0307.impl.MyCalculator.*(int,int))")
    public void hahah(){}
    @Before("hahah()")
    public static void longstart(JoinPoint joinPoint){
        //获取目标方法运行使用的参数
        Object[] args = joinPoint.getArgs();
        //获取方法签名
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println("["+name+"]方法开始执行了，运行了方法参数是【"+Arrays.asList(args)+"]");
    }
    @AfterReturning(value = "hahah()",returning = "result")
    public static void longend(JoinPoint joinPoint,Object result){
        //获取目标方法运行使用的参数
        Object[] args = joinPoint.getArgs();
        //获取方法签名
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println("["+name+"]方法正常执行完毕了了"+result);
    }
    @AfterThrowing(value="hahah()",throwing="expection")
    public static void logException(JoinPoint joinPoint,Exception expection) {
        System.out.println("【"+joinPoint.getSignature().getName()+"】方法执行出现异常了"+"异常信息是"+expection);
    }

    //想在目标方法结束的时候执行
    @After("hahah()")
    public int logEnd(JoinPoint joinPoint) {
        System.out.println("【"+joinPoint.getSignature().getName()+"】方法最终结束了");
        return 0;
    }
    @Around("hahah()")
    public Object myAround(ProceedingJoinPoint pjp){
        Object[] args = pjp.getArgs();
        String name = pjp.getSignature().getName();
        Object proceed = null;
        try {
            //@Before
            System.out.println("【环绕前置通知】【"+name+"方法开始】");
            //就是利用反射调用目标方法即可，就是method.invoke(obj,args)
            proceed = pjp.proceed(args);
            //@AfterReturing
            System.out.println("【环绕返回通知】【"+name+"方法返回，返回值"+proceed+"】");
        } catch (Exception e) {
            //@AfterThrowing
            System.out.println("【环绕异常通知】【"+name+"】方法出现异常，异常信息："+e);
            //为了让外界能知道这个异常，这个异常一定抛出去
            throw new RuntimeException(e);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally{
            //@After
            System.out.println("【环绕后置通知】【"+name+"】方法结束");
        }

        //反射调用后的返回值也一定返回出去
        return proceed;
    }
}
