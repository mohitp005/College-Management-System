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

import com.example.cms.model.Admin;
import com.example.cms.service.AdminServices;


@RestController
@CrossOrigin
@RequestMapping("/cms")
public class AdminController {
	
	@Autowired
	AdminServices adminservices;
	
	@GetMapping("/admin")
	public List<Admin> getAllCategory()
	{
		return adminservices.viewadmin();
	}
	
	@GetMapping("/admin/{roleId}")
	public Admin getCategoryById(@PathVariable("roleId") long roleId)
	{
		return adminservices.viewadminbyid(roleId);
	}
	
	@PostMapping("/admin")
	public Admin addAdmin( @RequestBody Admin admin)
	{
		return adminservices.addAdmin(admin);
	}
	
	@PutMapping("/admin/{roleId}")
	public Admin updateAdmin(@RequestBody Admin admin) {
		
		return adminservices.updateAdmin(admin);
	}
	
	@DeleteMapping("/admin/{roleId}")
	public String deleteCategory(@PathVariable("roleId") long roleId)
	{
		adminservices.removeAdmin(roleId);
				return "Admin deleted succesfully";
	}	
	
}
