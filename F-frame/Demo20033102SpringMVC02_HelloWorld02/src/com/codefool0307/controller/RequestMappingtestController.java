package com.codefool0307.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/haha")
@Controller
public class RequestMappingtestController {
    @RequestMapping(value = "/handle01",method = RequestMethod.POST)
    public String handle01(){
        System.out.println("RequestMappingTestController......");
        return "zhongjian";
    }
    @RequestMapping(value = "/handele02",params = {"username!=123","pwd","!age"})
    public String handle02(){
        System.out.println("RequestMappingTestController的handele02.。。。。。");
        return "success";
    }
    @RequestMapping(value = "/handele03",headers = {"User-Agent=Mozilla/5.0 (Windows NT 6.3; WOW64; rv:34.0) Gecko/20100101 Firefox/34.0"})
    public String handle03(){
        System.out.println("RequestMappingTestController的handele02.。。。。。");
        return "error";
    }
}
