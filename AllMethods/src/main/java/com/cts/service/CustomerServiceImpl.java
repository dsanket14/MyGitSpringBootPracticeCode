package com.cts.service;

import com.cts.dao.CustomerDaoImpl;
import com.cts.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl {

    @Autowired
    CustomerDaoImpl customerDaoImpl;


    public Customer saveData(Customer customer){
        return customerDaoImpl.saveData(customer);
    }

    public Optional<Customer> getDataById(int custId){
        return customerDaoImpl.getDataById(custId);
    }

    public List<Customer> getAllData(){
        return customerDaoImpl.getAllData();
    }

    public Customer updateData(Customer customer){
        return customerDaoImpl.updateData(customer);
    }

    public void deleteDataById(int custId){
        customerDaoImpl.deleteDataById(custId);
    }
}
