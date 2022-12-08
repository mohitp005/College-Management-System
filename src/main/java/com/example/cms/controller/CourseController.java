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

import com.example.cms.model.Course;
import com.example.cms.service.CourseServices;

@RestController
@CrossOrigin
@RequestMapping("/cms")
public class CourseController {

	@Autowired
	CourseServices courseservices;
	
	@GetMapping("/course")
	public List<Course> getAllCourse()
	{
		return courseservices.viewCourse();
	}
	
	@GetMapping("/course/{courseId}")
	public Course getCourseById(@PathVariable("courseId") long courseId)
	{
		return courseservices.viewCourseById(courseId);
	}
	
	@PostMapping("/course")
	public Course addCourse( @RequestBody Course course)
	{
		return courseservices.addCourse(course);
	}
	
	@PutMapping("/course/{courseId}")
	public Course updateCourse(@RequestBody Course course) {
		
		return courseservices.updateCourse(course);
	}
	
	@DeleteMapping("/course/{courseId}")
	public String deleteCourse(@PathVariable("courseId") long courseId)
	{
		courseservices.removeCourse(courseId);
				return "Course deleted succesfully";
	}
	
}
