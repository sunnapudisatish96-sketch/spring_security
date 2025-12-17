package com.example.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.repository.CustomerRepository;
import com.example1.api.entity.Customer;

@RestController
@RequestMapping("/customers")

public class CustomerController {
	 @Autowired
	    private CustomerRepository repo;

	    @PostMapping("/add")
	    public String add(@RequestBody Customer c) {
	    	if(repo.existsByEmail(c.getEmail())) {
	    		return "Email already Exists!";
	    	}
	    	repo.save(c);
	    	return "Customer saved";
	    }
}
//@Autowired
//private CustomerRepository repo;
//@PostMapping("/add")
//public String add(@RequestBody Customer c) {
//	if(repo.existsByEmail(c.getEmail())) {
//		return "Email already Exists";
//	}
//	repo.save(c);
//	return "Customer saved";
//}
//}
//	public String add(@RequestBody Customer c) {
//		if(repo.existsByEmail(c.getEmail())) {
//			return "Email already Exists";
//		}
//		repo.save(c);
//		return "Customer saved";
//	}