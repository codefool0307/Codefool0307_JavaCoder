package com.codefool0307.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
@RequestMapping(value = "/handle01")
    public String handle01(){
        System.out.println("HelloController01......");
        return "success";
    }
    @RequestMapping("/handle02")
    public String handle02(){
        System.out.println("HelloController02......");
        return "error";
    }
    @RequestMapping("/handle03")
    public String handle03(){
        System.out.println("HelloController03......");
        return "zhongjian";
    }
}
