package com.example.cms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cms.model.Subject;

@Repository
public interface SubjectDao extends JpaRepository<Subject, Long>{
	
	

}
