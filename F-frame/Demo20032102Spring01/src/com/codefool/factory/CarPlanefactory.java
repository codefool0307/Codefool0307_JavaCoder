package com.codefool.factory;
import com.codefool.bean.Car;
public class CarPlanefactory {
    public static Car carzao(String name){
        Car car = new Car();
        car.setCarName(name);
        car.setColor("2");
        car.setPrice(1);
        System.out.println("shiyou"+car.getCarName()+"zhengzaizhizuo");
        return car;
    }
}
