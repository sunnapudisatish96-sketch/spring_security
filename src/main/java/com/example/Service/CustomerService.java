package com.example.Service;

import org.springframework.stereotype.Service;

import com.example.Customer.Customer;
import com.example.repository.CustomerRepository;

@Service
public class CustomerService {
	private final CustomerRepository customerRepo;
	public CustomerService(CustomerRepository customerRepo) {
		this.customerRepo=customerRepo;
	}
	public Customer saveCustomer(Customer customer) {
		return customerRepo.save(customer);
	}
	public Customer getCustomer(Long id) {
		return customerRepo.findById(id).orElse(null);
	}

}
