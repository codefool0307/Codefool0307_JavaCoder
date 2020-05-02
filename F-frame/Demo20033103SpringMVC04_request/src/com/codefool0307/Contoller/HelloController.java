package com.codefool0307.Contoller;

import com.codefool0307.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hellp(){
        System.out.println("111");
        return "success";
    }
    @RequestMapping("/handle")
    public String handle(Book book){
        System.out.println("得到的信息"+book);
        return "success";
    }
    @RequestMapping("/handle03")
    public String handle03(HttpSession session,
                           HttpServletRequest request, HttpServletResponse response){
        System.out.println("chuandi");
        return "success";
    }
}
