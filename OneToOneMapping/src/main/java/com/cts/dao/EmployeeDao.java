package com.cts.dao;

import com.cts.model.Address;
import com.cts.model.Employee;
import com.cts.repo.AddressRepo;
import com.cts.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDao {

    @Autowired
    EmployeeRepo employeeRepoImpl;

    @Autowired
    AddressRepo addressRepoImpl;

    public Address saveAddressData(Address address){
        return addressRepoImpl.save(address);
    }
    public Employee saveEmployeeData(Employee employee){
        return employeeRepoImpl.save(employee);
    }

    public List<Employee> getAllEmployee(){
        return employeeRepoImpl.findAll();
    }

    public List<Address> getAllAddress(){
        return addressRepoImpl.findAll();
    }

    public void deleteEmployeeById(int empId){
        employeeRepoImpl.deleteById(empId);
    }

    public void deleteAddressById(int addressId){
        addressRepoImpl.deleteById(addressId);
    }

}
