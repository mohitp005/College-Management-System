package com.example.cms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.example.cms.model.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Long> {
	
	
	
	

}
