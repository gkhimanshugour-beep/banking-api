package com.cb.main.service;

import java.util.List;
import com.cb.main.dto.AccountDto;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccount(String accountNumber);

    AccountDto deposit(String accountNumber, double amount);

    AccountDto withdraw(String accountNumber, double amount);

    List<AccountDto> getAllAccount();

    void deleteAccount(String accountNumber);
}