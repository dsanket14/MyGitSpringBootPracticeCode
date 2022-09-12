package com.cts.controller;

import com.cts.exception.RecordNotFoundException;
import com.cts.model.Customer;
import com.cts.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerServiceImpl;

    @GetMapping("/getdatabyid/{custId}")
    public Optional<Customer> getDataById(@PathVariable int custId){


        return customerServiceImpl.getDataById(custId);
    }

    @GetMapping("/getalldata")
    public List<Customer> getAllData(){
        return customerServiceImpl.getAllData();
    }

    @PostMapping("/savedata")
    public Customer saveData(@RequestBody Customer customer){
        return customerServiceImpl.saveData(customer);
    }
    @PutMapping("/updatedata/{custId}")
    public Customer updateData(@PathVariable int custId, @RequestBody Customer customer) throws RecordNotFoundException {

        Customer customer1 = customerServiceImpl.getDataById(custId).orElseThrow(()-> new RecordNotFoundException("Customer Id Doesn't exist"));
//

        customer1.setCustName(customer.getCustName());
        customer1.setCustAddress(customer.getCustAddress());
        customer1.setCustDOB(customer.getCustDOB());
        customer1.setCustContactNumber(customer.getCustContactNumber());
        customer1.setCustEmailId(customer.getCustEmailId());

        return customerServiceImpl.updateData(customer1);
    }

    @DeleteMapping("/deletedatabyid/{custId}")
    public String deleteDataById(@PathVariable int custId){


        customerServiceImpl.deleteDataById(custId);
        return "Data Deleted Successfully";
    }
}
