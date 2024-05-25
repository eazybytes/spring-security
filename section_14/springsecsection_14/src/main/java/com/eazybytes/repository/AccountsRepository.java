package com.eazybytes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eazybytes.model.Accounts;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Integer> {
	
	Accounts findByCustomerId(int customerId);

}
