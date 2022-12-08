package com.example.cms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cms.model.Course;

@Service
public interface CourseServices {


	public Course addCourse(Course course);

	public void removeCourse(long courseId);

	public List<Course> viewCourse();

	public Course viewCourseById(long courseId);

	public Course updateCourse(Course course);

	
	
}
