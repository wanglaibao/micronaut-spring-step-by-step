package com.laibao.micronaut.spring.app.controller;

import com.laibao.micronaut.spring.app.domain.Customer;
import com.laibao.micronaut.spring.app.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping("/save")
    public String process(){
        repository.save(new Customer("Jack", "Smith"));
        repository.save(new Customer("Adam", "Johnson"));
        repository.save(new Customer("Kim", "Smith"));
        repository.save(new Customer("David", "Williams"));
        repository.save(new Customer("Peter", "Davis"));
        return "Done";
    }

    @GetMapping("/findAll")
    public Iterable<Customer> findAll(){
       return repository.findAll();
    }

    @GetMapping("/findById")
    public Customer findById(@RequestParam("id") long id){
        Optional<Customer> customer=  repository.findById(id);
        return customer.orElse(new Customer("jin","ge"));
    }

    @GetMapping("/findByLastName")
    public String fetchDataByLastName(@RequestParam("lastname") String lastName){
        String result = "";
        for(Customer cust: repository.findByLastName(lastName)){
            result += cust.toString() + "</br>";
        }
        return result;
    }
}
