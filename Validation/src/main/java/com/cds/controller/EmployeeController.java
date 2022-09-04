package com.cds.controller;

import com.cds.model.Employee;
import com.cds.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeServiceImpl;

    @PostMapping("/singup")
    public Employee signUp(@Valid @RequestBody Employee employee){
        return employeeServiceImpl.signUp(employee);
    }

    @GetMapping("/signin/{empEmailId}/{empPassword}")
    public Boolean signIn(@PathVariable String empEmailId, @PathVariable String empPassword){
        return employeeServiceImpl.signIn(empEmailId, empPassword);
    }

    @GetMapping("/getalldata")
    public List<Employee> getAllData(){
        return employeeServiceImpl.getAllData();
    }

    @GetMapping("/getbymb/{empMb}")
    public Employee findByEmpMb(@PathVariable long empMb){
        return employeeServiceImpl.findByEmpMb(empMb);
    }
}
