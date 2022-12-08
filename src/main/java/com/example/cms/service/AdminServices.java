package com.example.cms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cms.model.Admin;


@Service
public interface AdminServices {
	
	public Admin addAdmin(Admin admin);
	public void removeAdmin(long roleId);
	public List<Admin> viewadmin();
	public Admin viewadminbyid(long roleId);
	public Admin updateAdmin(Admin admin);
	

}
