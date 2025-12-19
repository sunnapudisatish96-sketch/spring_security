package com.example3.banking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example3.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByUserId(Long userId);
}
