package com.example.springjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springjdbc.domain.Department;
import com.example.springjdbc.service.DepartmentService;


@Controller
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    public DepartmentService service;

    @RequestMapping("/execute")
    public String execute(Model model){
        // Department department = new Department();
        // department.setName("経理部");
        // service.save(department);

        // Department department2 = service.load(2);
        // System.out.println(department2);
        // service.deleteById(7);
        service.findAll().forEach(System.out::println);
        model.addAttribute("departmentList", service.findAll());
        return "department-result";
    }

}
