package com.codefool0307.Servlet;

import com.codefool0307.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CarServlet {
    @Autowired
    private CarService carService;

    public void doGet(){
       carService.save();
    }
}
