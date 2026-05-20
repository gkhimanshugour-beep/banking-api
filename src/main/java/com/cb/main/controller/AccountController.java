package com.cb.main.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.cb.main.dto.AccountDto;
import com.cb.main.dto.adminDto;
import com.cb.main.service.AccountService;
import com.cb.main.service.AdminService;

@RestController

@CrossOrigin(
        origins = "https://bankingapp-10te.onrender.com",
        allowedHeaders = "*",
        methods = {
                RequestMethod.GET,
                RequestMethod.POST,
                RequestMethod.PUT,
                RequestMethod.DELETE,
                RequestMethod.OPTIONS
        }
)

public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AdminService adminService;

    // ================= MASK SENSITIVE DATA =================

    private AccountDto maskSensitiveData(AccountDto dto) {

        if (dto == null) return null;

        // Aadhaar Masking
        if (dto.getAadhar() != null && dto.getAadhar().length() >= 4) {

            String rawAadhar = dto.getAadhar();

            dto.setAadhar(
                    "XXXXXXXX" +
                    rawAadhar.substring(rawAadhar.length() - 4)
            );

        } else if (dto.getAadhar() != null) {

            dto.setAadhar("[Aadhaar Redacted]");
        }

        // PAN Masking
        if (dto.getPan() != null && dto.getPan().length() >= 5) {

            String rawPan = dto.getPan();

            dto.setPan(
                    "XXXXX" +
                    rawPan.substring(rawPan.length() - 5)
            );
        }

        return dto;
    }

    // ================= ADMIN LOGIN =================

    @PostMapping("/login")
    public String login(@RequestBody adminDto admindto) {

        return adminService.login(
                admindto.getId(),
                admindto.getPassword()
        );
    }

    // ================= CREATE ACCOUNT =================

    @PostMapping("/account")
    public ResponseEntity<AccountDto> addAccount(
            @RequestBody AccountDto accountDto
    ) {

        AccountDto created =
                accountService.createAccount(accountDto);

        return new ResponseEntity<>(
                maskSensitiveData(created),
                HttpStatus.CREATED
        );
    }

    // ================= GET ACCOUNT =================

    @GetMapping("/account/{accountNumber}")
    public ResponseEntity<AccountDto> getAccount(
            @PathVariable String accountNumber
    ) {

        AccountDto account =
                accountService.getAccount(accountNumber);

        return ResponseEntity.ok(
                maskSensitiveData(account)
        );
    }

    // ================= DEPOSIT =================

    @PutMapping("/deposit/{accountNumber}")
    public ResponseEntity<AccountDto> deposit(

            @PathVariable String accountNumber,

            @RequestBody Map<String, Double> request
    ) {

        Double amount = request.get("amount");

        AccountDto updated =
                accountService.deposit(accountNumber, amount);

        return ResponseEntity.ok(
                maskSensitiveData(updated)
        );
    }

    // ================= WITHDRAW =================

    @PutMapping("/withdraw/{accountNumber}")
    public ResponseEntity<AccountDto> withdraw(

            @PathVariable String accountNumber,

            @RequestBody Map<String, Double> request
    ) {

        Double amount = request.get("amount");

        AccountDto updated =
                accountService.withdraw(accountNumber, amount);

        return ResponseEntity.ok(
                maskSensitiveData(updated)
        );
    }

    // ================= GET ALL ACCOUNTS =================

    @GetMapping("/accounts")
    public ResponseEntity<List<AccountDto>> getAllAccountDetails() {

        List<AccountDto> accounts =
                accountService.getAllAccount();

        List<AccountDto> maskedAccounts = accounts.stream()
                .map(this::maskSensitiveData)
                .collect(Collectors.toList());

        return ResponseEntity.ok(maskedAccounts);
    }

    // ================= DELETE ACCOUNT =================

    @DeleteMapping("/account/{accountNumber}")
    public ResponseEntity<String> deleteAccount(
            @PathVariable String accountNumber
    ) {

        accountService.deleteAccount(accountNumber);

        return ResponseEntity.ok(
                "Account Deleted Successfully!"
        );
    }
}

// ================= GLOBAL CORS CONFIG =================

@Configuration
class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {

        return new WebMvcConfigurer() {

            @Override
            public void addCorsMappings(CorsRegistry registry) {

                registry.addMapping("/**")

                        .allowedOrigins(
                                "https://bankingapp-10te.onrender.com"
                        )

                        .allowedMethods(
                                "GET",
                                "POST",
                                "PUT",
                                "DELETE",
                                "OPTIONS"
                        )

                        .allowedHeaders("*")

                        .exposedHeaders("Authorization");
            }
        };
    }
}