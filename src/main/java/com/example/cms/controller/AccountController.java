package com.example.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cms.model.Account;
import com.example.cms.service.AccountServices;


@RestController
@CrossOrigin
@RequestMapping("/cms")
public class AccountController {

	@Autowired
	AccountServices accountservices;
	
	@GetMapping("/account")
	public List<Account> getAllCategory()
	{
		return accountservices.viewAccount();
	}
	
	@GetMapping("/account/{account_id}")
	public Account getCategoryById(@PathVariable("account_id") long account_id)
	{
		return accountservices.viewAccountById(account_id);
	}
	
	@PostMapping("/account")
	public Account addAccount( @RequestBody Account account)
	{
		return accountservices.addAccount(account);
	}
	
	@PutMapping("/account/{account_id}")
	public Account updateAccount(@RequestBody Account account) {
		
		return accountservices.updateAccount(account);
	}
	
	@DeleteMapping("/account/{account_id}")
	public String deleteCategory(@PathVariable("account_id") long account_id)
	{
		accountservices.removeAccount(account_id);
				return "Account deleted succesfully";
	}	
}
