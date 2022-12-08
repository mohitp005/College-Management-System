package com.example.cms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cms.model.Account;

@Service
public interface AccountServices  {

	public Account addAccount(Account account);
	public void removeAccount(long account_id);
	public List<Account> viewAccount();
	public Account viewAccountById(long account_id);
	public Account updateAccount(Account account);
	
}
