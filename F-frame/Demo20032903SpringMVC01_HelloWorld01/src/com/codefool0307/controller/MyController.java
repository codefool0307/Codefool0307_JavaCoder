package com.codefool0307.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyController {
    @RequestMapping("/hello")
    public String myfirest(){
        System.out.println("请求收到了");
        return "success";
    }
}
