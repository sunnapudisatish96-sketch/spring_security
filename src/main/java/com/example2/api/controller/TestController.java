package com.example2.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example2.api.entity.Customer;
import com.example2.api.entity.Role;
import com.example2.api.repository.CustomerRepository;


@RestController
public class TestController {

    private final CustomerRepository customerRepo;

    public TestController(CustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }

    @GetMapping("/insert")
    public String insertData() {

        Customer c = new Customer(); 
        c.setName("Satish");

        Role r1 = new Role();         
        r1.setRoleName("ADMIN");
        r1.setCustomer(c);         

        Role r2 = new Role();         
        r2.setRoleName("USER");
        r2.setCustomer(c);          

        c.setRoles(List.of(r1, r2));  

        customerRepo.save(c);         

        return "Inserted into MySQL";
    }

    @GetMapping("/customers")
    public List<Customer> getAll() {
        return customerRepo.findAll();
    }
}
