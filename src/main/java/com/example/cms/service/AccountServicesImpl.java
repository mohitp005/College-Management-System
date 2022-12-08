package com.example.cms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cms.DAO.AccountDao;
import com.example.cms.model.Account;

@Service
public class AccountServicesImpl implements AccountServices {

	@Autowired
	AccountDao accountdao;
	
	@Override
	public Account addAccount(Account account) {
		
		return accountdao.save(account);
	}

	@Override
	public void removeAccount(long account_id) {
		// TODO Auto-generated method stub
		 accountdao.deleteById(account_id);
	}

	@Override
	public List<Account> viewAccount() {
		
		return accountdao.findAll();
	}
	
	@Override
	public Account viewAccountById(long account_id) {
		
		Optional <Account> category=accountdao.findById(account_id);
		return category.get();
	}

	@Override
	public Account updateAccount(Account account) {
		
		Optional <Account> accounts=accountdao.findById(account.getAccount_id());
		
		Account at=accounts.get();
		
		at.setAccount_id(account.getAccount_id());
		at.setPaid_fees(account.getPaid_fees());
		at.setTotal_ammount(account.getTotal_ammount());
		at.setFees_status(account.getFees_status());
		at.setStdid(account.getStdid());
		
		at=accountdao.save(at);
		return at;
	}

	

}
