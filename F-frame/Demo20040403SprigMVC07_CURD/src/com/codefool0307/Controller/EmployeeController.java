package com.codefool0307.Controller;

import com.codefool0307.Dao.DepartmentDao;
import com.codefool0307.Dao.EmployeeDao;
import com.codefool0307.bean.Department;
import com.codefool0307.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;
@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao department;

    @RequestMapping("/emps")
    public String getEmps(Model model){
        System.out.println("在页面上展示");
        Collection<Employee> all =employeeDao.getAll();
        model.addAttribute("emps",all);
        return "list";
    }

    @RequestMapping(value = "/emp",method = RequestMethod.POST)
    public String AddEmp(Employee employee){


    }

    @RequestMapping(value = "/emp",method = RequestMethod.POST)
    public String AddEmp(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }


    @RequestMapping("/toaddpage")
    public String toAddPage(Model model){
        Collection<Department> departments = department.getDepartments();
        model.addAttribute("depts",departments);
        //model.addAttribute("command",new Employee(null,"wang","@13",1,department.getDepartment(101)));
        model.addAttribute("employee",new Employee());
        return "add";
    }
}
