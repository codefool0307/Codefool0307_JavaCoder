package com.codefool0307.Servlet;

import com.codefool0307.Service.CarService;
import com.codefool0307.dao.CarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class CarServlet3 {

    @Autowired
    public void hahah(CarDao carDao,@Qualifier("carService")CarService carServiceEXT2){
        System.out.println("wokeyizijiyunxing");
    }


}
