package com.example.cms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cms.DAO.CourseDao;
import com.example.cms.model.Course;

@Service
public class CourseServicesImpl implements CourseServices {

	@Autowired
	CourseDao coursedao;
	
	@Override
	public Course addCourse(Course course) {
		return coursedao.save(course);
	}

	@Override
	public void removeCourse(long courseId) {
		coursedao.deleteById(courseId);

	}

	@Override
	public List<Course> viewCourse() {
		return coursedao.findAll();
	}

	@Override
	public Course viewCourseById(long courseId) {
		Optional<Course> crs = coursedao.findById(courseId);
		return crs.get();
	}

	@Override
	public Course updateCourse(Course course) {
		Optional<Course> courses = coursedao.findById(course.getCourseId());

		Course at = courses.get();

		at.setCourseId(course.getCourseId());
		at.setCourseName(course.getCourseName());
		
		
		at = coursedao.save(at);
		return at;
	}

}
