package com.codespeaks.rest.customerservice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.codespeaks.rest.customerservice.domain.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
	Page<Account> findByCustomerCustomerId(Integer customerId, Pageable pageable);
}
