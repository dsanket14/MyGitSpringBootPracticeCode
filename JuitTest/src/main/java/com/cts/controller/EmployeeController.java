package com.cts.controller;

import com.cts.model.Employee;
import com.cts.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeServiceImpl;

    @PostMapping("/save")
    public Employee saveData(@RequestBody Employee employee){
        return employeeServiceImpl.saveData(employee);
    }

    @GetMapping("/getall")
    public List<Employee> getAll(){
        return employeeServiceImpl.getAll();
    }
}
