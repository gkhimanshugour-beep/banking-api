package com.cb.main.mapper;

import com.cb.main.dto.AccountDto;
import com.cb.main.entiteis.Account;

public class AccountMapper {

    // DTO -> Entity
    public static Account mapToAccount(AccountDto dto) {

        Account account = new Account();

        account.setId(dto.getId());
        account.setAccountNumber(dto.getAccountNumber());

        account.setName(dto.getName());
        account.setDob(dto.getDob());
        account.setMobile(dto.getMobile());
        account.setEmail(dto.getEmail());
        account.setAddress(dto.getAddress());
        account.setAadhar(dto.getAadhar());
        account.setPan(dto.getPan());

        account.setAccountType(dto.getAccountType());
        account.setBalance(dto.getBalance());

        return account;
    }

    // Entity -> DTO
    public static AccountDto mapToAccountDto(Account account) {

        AccountDto dto = new AccountDto();

        dto.setId(account.getId());
        dto.setAccountNumber(account.getAccountNumber());

        dto.setName(account.getName());
        dto.setDob(account.getDob());
        dto.setMobile(account.getMobile());
        dto.setEmail(account.getEmail());
        dto.setAddress(account.getAddress());
        dto.setAadhar(account.getAadhar());
        dto.setPan(account.getPan());

        dto.setAccountType(account.getAccountType());
        dto.setBalance(account.getBalance());

        return dto;
    }
}