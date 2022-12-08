package com.example.cms.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")

public class Course {

	@Id
	@Column(name = "c_id")
	private Long courseId;
	@Column(name = "c_name")
	private String courseName;

	/*
	 * @Column(name="courseid") private long subid;
	 * 
	 * @OneToMany(targetEntity=Student.class,cascade=CascadeType.ALL)
	 * 
	 * @JoinColumn(name="courseid",insertable = false,updatable = false) private
	 * Set<Subject> subjects;
	 */

	public Course() {
		super();

	}

	public Course(Long courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + "]";
	}


	
	
	
	
	
	

}
