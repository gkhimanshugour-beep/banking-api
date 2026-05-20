package com.cb.main.entiteis;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Bank generated unique account number
    @Column(unique = true, nullable = false)
    private String accountNumber;

    private String name;
    private String dob;
    private String mobile;
    private String email;
    private String address;
    private String aadhar;
    private String pan;

    private String accountType; // SAVINGS / CURRENT

    private double balance;

    public Account() {
    }

    public Account(Long id, String accountNumber, String name, String dob,
                   String mobile, String email, String address,
                   String aadhar, String pan,
                   String accountType, double balance) {

        this.id = id;
        this.accountNumber = accountNumber;
        this.name = name;
        this.dob = dob;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
        this.aadhar = aadhar;
        this.pan = pan;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}