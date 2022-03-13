package com.ivan.Hohryakov.mvc.hibernate.aop.controller;

import com.ivan.Hohryakov.mvc.hibernate.aop.dao.EmployeeDao;
import com.ivan.Hohryakov.mvc.hibernate.aop.entity.Employee;
import com.ivan.Hohryakov.mvc.hibernate.aop.service.EmployeeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeService service;

    @RequestMapping("/")
    public String showAllEmployees(Model model){
        List<Employee> allEmployees  = service.getAllEmployees();
        model.addAttribute("allEmps",allEmployees);
        return "all-employees";
    }
    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model){

        Employee employee = new Employee();
        model.addAttribute("employee",employee);
//Возвращает страницу с названием
        return "employee-info";
    }
    //сохранение работника
    @RequestMapping("saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        service.saveEmployee(employee);

        return "redirect:/";

    }
    //Изменение работника
    @RequestMapping("/update-info")
    public String updateEmployee(@RequestParam("empId") int id, Model model){

        Employee employee = service.getEmployee(id);

        model.addAttribute("employee",employee);
        return "employee-info";
    }

    //Удаление работника
    @RequestMapping("/delete-employee")
    public String deleteEmployee(@RequestParam("empId") int id){


        service.deleteEmployee(id);
        return "redirect:/";
    }
}
