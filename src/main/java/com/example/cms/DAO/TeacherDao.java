package com.example.cms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.cms.model.Teacher;

public interface TeacherDao extends JpaRepository<Teacher, Long>{

}
