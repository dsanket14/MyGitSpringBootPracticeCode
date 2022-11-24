package com.nag.service;

import com.nag.dao.EmployeeDao;
import com.nag.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDaoImpl;

    public Employee saveDate(Employee employee){
        return employeeDaoImpl.saveDate(employee);
    }

    public List<Employee> getAllData(){
        return employeeDaoImpl.getAllData();
    }

    public void deleteById(int empId){
        employeeDaoImpl.deleteById(empId);
    }

    public void  deleteAll(){
        employeeDaoImpl.deleteAll();
    }
}
