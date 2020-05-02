package com.codefool0307.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
@SessionAttributes(value = "msg")
@Controller
public class OutputController {
    @RequestMapping("/handle01")
    public String handle01(Map<String,Object> map){
        map.put("msg","你好");
        return "success";
    }
    @RequestMapping("/handle02")
    public String handle02(Model model){
        model.addAttribute("msg","你好");
        return "success";
    }
    @RequestMapping("/handle03")
    public String handle03(ModelMap modelMap){
        modelMap.addAttribute("msg","你好");
        return "success";
    }
    @RequestMapping("/handle04")
    public ModelAndView handle04(){
        //由于之前的返回值我们就叫视图名：视图名解析器会帮助我们最终拼串得到真是的地址
        ModelAndView vm = new ModelAndView("success");
        //也可以使用无参构造器
        ModelAndView vm1 = new ModelAndView();
        vm1.setViewName("success");
        vm.addObject("msg","你好");
        return vm;
    }
}
