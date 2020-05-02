package com.codefool0307.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("111");
        return "success";
    }
}
