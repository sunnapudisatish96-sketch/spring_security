package com.example3.banking.config;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example3.banking.entity.Account;
import com.example3.banking.repository.AccountRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public List<Account> getAccountsByUserId(Long userId) {
        return accountRepository.findByUserId(userId);
    }
}
