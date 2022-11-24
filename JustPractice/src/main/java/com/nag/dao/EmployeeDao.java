package com.nag.dao;

import com.nag.model.Employee;
import com.nag.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDao {

    @Autowired
    EmployeeRepo employeeRepoImpl;

    public Employee saveDate(Employee employee){
        return employeeRepoImpl.save(employee);
    }

    public List<Employee> getAllData(){
        return employeeRepoImpl.findAll();
    }

    public void deleteById(int empId){
        employeeRepoImpl.deleteById(empId);
    }

    public void  deleteAll(){
        employeeRepoImpl.deleteAll();
    }
}
