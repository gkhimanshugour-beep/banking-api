package com.cb.main.repository;




import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cb.main.entiteis.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByAccountNumber(String accountNumber);
}