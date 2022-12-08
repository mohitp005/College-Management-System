package com.example.cms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cms.DAO.AdminDao;
import com.example.cms.model.Admin;

@Service
public class AdminServicesImpl implements AdminServices {

	@Autowired
	public AdminDao admindao;

	@Override
	public Admin addAdmin(Admin admin) {
		
		return admindao.save(admin);
	}

	@Override
	public void removeAdmin(long roleId) {
		// TODO Auto-generated method stub
		admindao.deleteById(roleId);
	}

	@Override
	public List<Admin> viewadmin() {
		// TODO Auto-generated method stub
		return admindao.findAll();
	}

	@Override
	public Admin viewadminbyid(long roleId) {
		
		Optional <Admin> ad=admindao.findById(roleId);
		return ad.get();
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		
    Optional <Admin> admins=admindao.findById(admin.getRoleId());
		
		Admin adm=admins.get();
		
		adm.setRoleId(admin.getRoleId());
		adm.setAdminname(admin.getAdminname());
		adm.setAdminemail(admin.getAdminemail());
		adm.setAdminpassword(admin.getAdminpassword());
		adm.setAdmingender(admin.getAdmingender());
		adm.setAdmincontactNo(admin.getAdmincontactNo());
		adm.setAdmindob(admin.getAdmindob());
		
		
		adm=admindao.save(adm);
		return adm;


	}


	

}
