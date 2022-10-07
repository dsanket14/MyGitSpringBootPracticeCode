package com.cts.controller;


import com.cts.dao.EmployeeDao;
import com.cts.model.Address;
import com.cts.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDaoImpl;

    @PostMapping("/svaeemployee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeDaoImpl.saveEmployeeData(employee);
    }

    @PostMapping("/saveaddress")
    public Address saveAddress(@RequestBody Address address){
        return employeeDaoImpl.saveAddressData(address);
    }

    @GetMapping("/getallemployee")
    public List<Employee> getAllEmployee(){
        return employeeDaoImpl.getAllEmployee();
    }

    @GetMapping("/getalladdresss")
    public List<Address> getAllAddress(){
        return employeeDaoImpl.getAllAddress();
    }

    @DeleteMapping("/deleteemployeebyid/{empId}")
    public String deleteEmpById(@PathVariable int empId){
        employeeDaoImpl.deleteEmployeeById(empId);
        return "Employee deleted for empId="+empId;
    }

    @DeleteMapping("/deleteaddressbyid/{addressId}")
    public String deleteAddById(@PathVariable int addressId){
        employeeDaoImpl.deleteAddressById(addressId);
        return "Address deleted for addressId="+addressId;
    }
}
