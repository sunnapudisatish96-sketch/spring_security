package com.example2.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example2.api.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
