package com.example.cms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cms.model.Account;

@Repository
public interface AccountDao extends JpaRepository<Account, Long> {

	
}
