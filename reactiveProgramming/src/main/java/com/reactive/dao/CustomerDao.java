package com.reactive.dao;

import com.reactive.dto.Customer;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class CustomerDao {

    private static void sleepMethod(int i){
        try{
        Thread.sleep(1500);}
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public List<Customer> getCustomers(){
        return IntStream.rangeClosed(1,10)
                .peek(i->System.out.println("Record Processed: "+i))
                .peek(CustomerDao::sleepMethod)
                .mapToObj(i->new Customer(i,"Customer"+i))
                .collect(Collectors.toList());
    }

    public Flux<Customer> getCustomerList(){
        return Flux.range(1,10)
                .delayElements(Duration.ofSeconds(1))
                .doOnNext(i -> System.out.println("processing count in stream flow : " + i))
                .map(i -> new Customer(i, "customer" + i));
    }

    public Flux<Customer> getCustomerListRouter(){
        return Flux.range(1,50)
                .doOnNext(i -> System.out.println("processing count in stream flow : " + i))
                .map(i -> new Customer(i, "customer" + i));
    }
    public Flux<Customer> getCustomersStream()  {
        return Flux.range(1,10)
                .delayElements(Duration.ofSeconds(1))
                .doOnNext(i -> System.out.println("processing count in stream flow : " + i))
                .map(i -> new Customer(i, "customer" + i));
    }
}
