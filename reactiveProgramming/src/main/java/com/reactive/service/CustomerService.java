package com.reactive.service;

import com.reactive.dao.CustomerDao;
import com.reactive.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao dao;

    public List<Customer> getCustomers(){
        long start=System.currentTimeMillis();
        List<Customer> list=dao.getCustomers();
        long end=System.currentTimeMillis();
        System.out.println("Processed Time: "+(end-start));
        return list;
    }

    public Flux<Customer> getCustomerList(){
        long start=System.currentTimeMillis();
        Flux<Customer> list=dao.getCustomerList();
        long end=System.currentTimeMillis();
        System.out.println("Processed Time: "+(end-start));
        return list;
    }
}
