package com.cds.service;

import com.cds.dao.EmployeeDao;
import com.cds.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDaoImpl;

    public Employee signUp(Employee employee){
        return employeeDaoImpl.signUp(employee);
    }

    public Boolean signIn(String empEmailId, String empPassword){
        return employeeDaoImpl.signIn(empEmailId,empPassword);
    }

    public List<Employee> getAllData(){
        return employeeDaoImpl.getAllData();
    }

    public Employee findByEmpMb(long empMb){
        return employeeDaoImpl.findByEmpMb(empMb);
    }
}
