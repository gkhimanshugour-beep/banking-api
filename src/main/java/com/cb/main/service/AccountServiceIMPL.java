package com.cb.main.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cb.main.dto.AccountDto;
import com.cb.main.entiteis.Account;
import com.cb.main.mapper.AccountMapper;
import com.cb.main.repository.AccountRepository;

@Service
public class AccountServiceIMPL implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceIMPL(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // ================= CREATE ACCOUNT =================
    @Override
    public AccountDto createAccount(AccountDto accountDto) {

        Account account = AccountMapper.mapToAccount(accountDto);

        // 🔥 generate account number (IMPORTANT)
        String accNo = "AC" + System.currentTimeMillis();
        account.setAccountNumber(accNo);

        account.setBalance(accountDto.getBalance());

        Account savedAccount = accountRepository.save(account);

        return AccountMapper.mapToAccountDto(savedAccount);
    }

    // ================= GET ACCOUNT =================
    @Override
    public AccountDto getAccount(String accountNumber) {

        Account account = accountRepository.findByAccountNumber(accountNumber)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        return AccountMapper.mapToAccountDto(account);
    }

    // ================= DEPOSIT =================
    @Override
    public AccountDto deposit(String accountNumber, double amount) {

        Account account = accountRepository.findByAccountNumber(accountNumber)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        account.setBalance(account.getBalance() + amount);

        Account saved = accountRepository.save(account);

        return AccountMapper.mapToAccountDto(saved);
    }

    // ================= WITHDRAW =================
    @Override
    public AccountDto withdraw(String accountNumber, double amount) {

        Account account = accountRepository.findByAccountNumber(accountNumber)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        if (account.getBalance() < amount) {
            throw new RuntimeException("Insufficient Balance");
        }

        account.setBalance(account.getBalance() - amount);

        Account saved = accountRepository.save(account);

        return AccountMapper.mapToAccountDto(saved);
    }

    // ================= GET ALL =================
    @Override
    public List<AccountDto> getAllAccount() {

        return accountRepository.findAll()
                .stream()
                .map(AccountMapper::mapToAccountDto)
                .collect(Collectors.toList());
    }

    // ================= DELETE =================
    @Override
    public void deleteAccount(String accountNumber) {

        Account account = accountRepository.findByAccountNumber(accountNumber)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        accountRepository.delete(account);
    }
}