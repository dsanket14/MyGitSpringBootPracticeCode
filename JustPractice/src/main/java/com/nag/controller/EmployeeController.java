package com.nag.controller;

import com.nag.model.Employee;
import com.nag.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/")
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeServiceImpl;

    @PostMapping("/save")
    public Employee saveDate(@RequestBody Employee employee){
        return employeeServiceImpl.saveDate(employee);
    }

    @GetMapping("/getall")
    public List<Employee> getAllData(){
        return employeeServiceImpl.getAllData();
    }

    @DeleteMapping("/deletebyid/{empId}")
    public String deleteById(@PathVariable int empId){
        employeeServiceImpl.deleteById(empId);
        return "Data Deleted for empId= "+empId;
    }

    @DeleteMapping("/deleteall")
    public String  deleteAll(){
        employeeServiceImpl.deleteAll();
        return "All Data deleted";
    }
}
