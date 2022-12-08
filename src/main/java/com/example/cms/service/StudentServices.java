package com.example.cms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cms.model.Student;

@Service
public interface StudentServices {

	public Student addStudent(Student student);
	public void removeStudent(long studentId);
	public List<Student> viewStudent();
	public Student viewStudentById(long studentId);
	public Student updateStudent(Student student);
	 
}
