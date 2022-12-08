package com.example.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "subject")
@Table(name = "subject")
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AA_SUBJECT_SEQ")
    @SequenceGenerator(sequenceName = "AA_SUBJECT_SEQ", allocationSize = 1, name = "AA_SUBJECT_SEQ")
	@Column(name = "subject_id")
	private long subjectId ;
	@Column(name = "subject_name")
	private String subjectname;
	
	@Column(name="t_id")
	private long tchrid;
	
	@ManyToOne
    @JoinColumn(name="t_id",insertable = false,updatable = false)
	private Teacher teacherId;
	
	
	@Column(name="c_id")
    private long crs_id;
    
    @ManyToOne
    @JoinColumn(name="c_id",insertable = false,updatable = false)
    private Course courseId;
	
	
	
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Subject(long subjectId, String subjectname, long tchrid, Teacher teacherId, long crs_id, Course courseId) {
		super();
		this.subjectId = subjectId;
		this.subjectname = subjectname;
		this.tchrid = tchrid;
		this.teacherId = teacherId;
		this.crs_id = crs_id;
		this.courseId = courseId;
	}




	public long getSubjectId() {
		return subjectId;
	}




	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}




	public String getSubjectname() {
		return subjectname;
	}




	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}




	public long getTchrid() {
		return tchrid;
	}




	public void setTchrid(long tchrid) {
		this.tchrid = tchrid;
	}




	public Teacher getTeacherId() {
		return teacherId;
	}




	public void setTeacherId(Teacher teacherId) {
		this.teacherId = teacherId;
	}




	public long getCrs_id() {
		return crs_id;
	}




	public void setCrs_id(long crs_id) {
		this.crs_id = crs_id;
	}




	public Course getCourseId() {
		return courseId;
	}




	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}




	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectname=" + subjectname + ", tchrid=" + tchrid
				+ ", teacherId=" + teacherId + ", crs_id=" + crs_id + ", courseId=" + courseId + "]";
	}


	
	
	

}
