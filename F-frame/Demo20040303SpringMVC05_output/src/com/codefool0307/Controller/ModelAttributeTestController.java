package com.codefool0307.Controller;

import com.codefool0307.bean.Book;
import com.sun.javafx.collections.MappingChange;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ModelAttributeTestController {
@RequestMapping("/updatebook")
    public String updateBook(@ModelAttribute("book") Book book){
        System.out.println("页面提交过来的图书信息："+book);
        return "success";
    }

    @ModelAttribute
    public void hahaMyModelAttributes(Map<String,Object> map){
        Book book = new Book(100, "西游记", "wuchngen", 98, 10, 98.9);
        System.out.println("数据库查到的数据是"+book);
        map.put("book",book);
        System.out.println("shujubaocunqilaile");
    }

}
