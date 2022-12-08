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

import com.example.cms.model.Teacher;
import com.example.cms.service.TeacherServices;

@RestController
@CrossOrigin
@RequestMapping("/cms")
public class TeacherController {

	@Autowired
	TeacherServices teacherservices;
	
	
	@GetMapping("/teacher")
	public List<Teacher> getAllCategory()
	{
		return teacherservices.viewTeacher();
	}
	
	@GetMapping("/teacher/{teacherId}")
	public Teacher getCategoryById(@PathVariable("teacherId") long teacherId)
	{
		return teacherservices.viewTeacherById(teacherId);
	}
	
	@PostMapping("/teacher")
	public Teacher addTeacher( @RequestBody Teacher teacher)
	{
		return teacherservices.addTeacher(teacher);
	}
	
	@PutMapping("/teacher/{teacherId}")
	public Teacher updateTeacher(@RequestBody Teacher teacher) {
		
		return teacherservices.updateTeacher(teacher);
	}
	
	@DeleteMapping("/teacher/{teacherId}")
	public String deleteCategory(@PathVariable("teacherId") long teacherId)
	{
		teacherservices.removeTeacher(teacherId);
				return "Teacher deleted succesfully";
	}	
	
}
