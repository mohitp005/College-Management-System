package com.example.cms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cms.model.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
