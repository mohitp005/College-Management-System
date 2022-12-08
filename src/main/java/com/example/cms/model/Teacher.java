package com.example.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "teacher")
@Table(name = "teacher")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AA_TEACHER_SEQ")
    @SequenceGenerator(sequenceName = "AA_TEACHER_SEQ", allocationSize = 1, name = "AA_TEACHER_SEQ")
	@Column(name = "t_id")
	private Long teacherId;
	@Column(name = "t_name")
	private String teacherName;
	@Column(name = "t_gender")
	private String teachergender;
	@Column(name = "t_contactNo")
	private String teachercontactNo;
	@Column(name = "t_email")
	private String teacheremail;
	@Column(name = "t_password")
	private String teacherpassword;
	@Column(name = "t_dob")
	private String teacherdob;
	@Column(name = "t_status")
    private String teacherstatus;
	
	
	
	
	
	
	public Teacher() {
		super();
	}



	public Teacher(Long teacherId, String teacherName, String teachergender, String teachercontactNo,
			String teacheremail, String teacherpassword, String teacherdob, String teacherstatus) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teachergender = teachergender;
		this.teachercontactNo = teachercontactNo;
		this.teacheremail = teacheremail;
		this.teacherpassword = teacherpassword;
		this.teacherdob = teacherdob;
		this.teacherstatus = teacherstatus;
	}



	public Long getTeacherId() {
		return teacherId;
	}



	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}



	public String getTeacherName() {
		return teacherName;
	}



	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}



	public String getTeachergender() {
		return teachergender;
	}



	public void setTeachergender(String teachergender) {
		this.teachergender = teachergender;
	}



	public String getTeachercontactNo() {
		return teachercontactNo;
	}



	public void setTeachercontactNo(String teachercontactNo) {
		this.teachercontactNo = teachercontactNo;
	}



	public String getTeacheremail() {
		return teacheremail;
	}



	public void setTeacheremail(String teacheremail) {
		this.teacheremail = teacheremail;
	}



	public String getTeacherpassword() {
		return teacherpassword;
	}



	public void setTeacherpassword(String teacherpassword) {
		this.teacherpassword = teacherpassword;
	}



	public String getTeacherdob() {
		return teacherdob;
	}



	public void setTeacherdob(String teacherdob) {
		this.teacherdob = teacherdob;
	}



	public String getTeacherstatus() {
		return teacherstatus;
	}



	public void setTeacherstatus(String teacherstatus) {
		this.teacherstatus = teacherstatus;
	}



	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teachergender=" + teachergender
				+ ", teachercontactNo=" + teachercontactNo + ", teacheremail=" + teacheremail + ", teacherpassword="
				+ teacherpassword + ", teacherdob=" + teacherdob + ", teacherstatus=" + teacherstatus + "]";
	}
	
	
	
	
	
	

}
