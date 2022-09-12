package com.cts.dao;

import com.cts.model.Customer;
import com.cts.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerDaoImpl {

    @Autowired
    CustomerRepository customerRepositoryImpl;


    public Customer saveData(Customer customer){
        return customerRepositoryImpl.save(customer);
    }

    public Optional<Customer> getDataById(int custId){
        return customerRepositoryImpl.findById(custId);
    }

    public List<Customer> getAllData(){
        return customerRepositoryImpl.findAll();
    }

    public Customer updateData(Customer customer){
        return customerRepositoryImpl.save(customer);
    }

    public void deleteDataById(int custId){
        customerRepositoryImpl.deleteById(custId);
    }
}
