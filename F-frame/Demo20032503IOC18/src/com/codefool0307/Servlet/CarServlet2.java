package com.codefool0307.Servlet;

import com.codefool0307.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class CarServlet2 {
    @Autowired
    @Qualifier("carServiceEXT")
    private CarService carServiceEXT2;

    public void doGet(){
       carServiceEXT2.save();
    }

}
