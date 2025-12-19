package com.example3.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example3.banking.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
