package com.coefool0307.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(){
        System.out.println("hello...");
        return "success";
    }
    @RequestMapping("/handle01")
    public String handle01(){
        System.out.println("handle01...");
        return "../../hello";
    }
    @RequestMapping("/handle02")
    public String handle02(){
        System.out.println("handle02...");
        return "forward:/handle01";
    }
    @RequestMapping("/handle03")
    public String handle03(){
        System.out.println("handle03...");
        return "redirect:/handle01";
    }
    @RequestMapping("/handle04")
    public String handle04(){
        System.out.println("handle04...");
        return "redirect:/handle03";
    }
    @RequestMapping("/tologin")
    public String handle05(){
        System.out.println("handle05...");
        return "login";
    }
}
