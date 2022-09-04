package com.cds.dao;

import com.cds.model.Employee;
import com.cds.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDao {

    @Autowired
    EmployeeRepo employeeRepoImpl;

    public Employee signUp(Employee employee){
        return employeeRepoImpl.save(employee);
    }

    public Boolean signIn(String empEmailId, String empPassword){
        boolean flag=false;
        for(Employee emp: employeeRepoImpl.findAll()){
            if(emp.getEmpEmailId().equals(empEmailId) && emp.getEmpPassword().equals(empPassword)){
                flag=true;
            }
        }
        return flag;
    }

    public List<Employee> getAllData(){
        return employeeRepoImpl.findAll();
    }

    public Employee findByEmpMb(long empMb){
        return employeeRepoImpl.findByEmpMb(empMb);
    }
}
