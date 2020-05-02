package com.codefool0307.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestMappingTest {
    @RequestMapping("/ant")
    public String antTest01(){
        System.out.println("test01.....");
        return "success";
    }
    @RequestMapping("/anttest0*")
    public String antTest02(){
        System.out.println("test02.....");
        return "error";
    }
    @RequestMapping("/user/{id}")
    public String pathVariable(@PathVariable("id")String id){
        System.out.println(id);
        return "zhongjian";
    }
}
