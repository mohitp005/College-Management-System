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


import com.example.cms.model.Student;
import com.example.cms.service.StudentServices;


@RestController
@CrossOrigin
@RequestMapping("/cms")
public class StudentController {

	@Autowired
	StudentServices studentservices;
	
	@GetMapping("/student")
	public List<Student> getAllCategory()
	{
		return studentservices.viewStudent();
	}
	
	@GetMapping("/student/{studentId}")
	public Student getCategoryById(@PathVariable("studentId") long studentId)
	{
		return studentservices.viewStudentById(studentId);
	}
	
	@PostMapping("/student")
	public Student addStudent( @RequestBody Student student)
	{
		return studentservices.addStudent(student);
	}
	
	@PutMapping("/student/{studentId}")
	public Student updateStudent(@RequestBody Student student) {
		
		return studentservices.updateStudent(student);
	}
	
	@DeleteMapping("/student/{studentId}")
	public String deleteCategory(@PathVariable("studentId") long studentId)
	{
		studentservices.removeStudent(studentId);
				return "Student deleted succesfully";
	}	
}
