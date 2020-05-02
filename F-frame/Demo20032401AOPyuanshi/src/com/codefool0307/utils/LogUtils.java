package com.codefool0307.utils;
import java.util.Arrays;
public class LogUtils {

    public static void longstart(Object...objects){
        System.out.println("add方法运行了方法参数是"+ Arrays.asList(objects));
    }
    public static void longend(Object...objects){
        System.out.println("add方法结束");
    }
}
