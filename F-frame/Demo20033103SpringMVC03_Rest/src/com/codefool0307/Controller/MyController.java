package com.codefool0307.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getBook(@PathVariable("id")Integer id){
        System.out.println("查询到第"+id+"图书");
        return "success";
    }
    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable("id")Integer id){
        System.out.println("删除第"+id+"图书");
        return "success";
    }
    @RequestMapping(value = "/user/{id}",method = RequestMethod.PUT)
    public String updateBook(@PathVariable("id")Integer id){
        System.out.println("更新第"+id+"图书");
        return "success";
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String addBook(){
        System.out.println("添加了本新图书");
        return "success";
    }
}
