package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Customer.Customer;
import com.example.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	public CustomerService service;
	public CustomerController(CustomerService service) {
		this.service=service;
	}
	@PostMapping("/save")
	public Customer save(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}
	@GetMapping("/get{id}")
	public Customer get(@PathVariable Long id) {
		return service.getCustomer(id);
	}

}
