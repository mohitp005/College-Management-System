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

@Entity(name="student")
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AA_STUDENT_SEQ")
    @SequenceGenerator(sequenceName = "AA_STUDENT_SEQ", allocationSize = 1, name = "AA_STUDENT_SEQ")
	@Column(name = "std_id", length = 255)
	 private Long studentId;
	@Column(name = "std_name", length = 255)
    private String studentName;
    @Column(name = "std_gender", length = 255)
    private String studentgender;
    @Column(name = "std_contactNo", length = 255)
    private String studentcontactNo;
    @Column(name = "std_email", length = 255)
    private String studentemail;
    @Column(name = "std_password", length = 255)
    private String studentpassword;
    @Column(name = "std_dob", length = 255)
    private String studentdob;
    @Column(name = "std_status", length = 255)
    private String studentstatus;
    
    @Column(name="c_id")
    private long cid;
    
    @ManyToOne
    @JoinColumn(name="c_id",insertable = false,updatable = false)
    private Course courseId;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long studentId, String studentName, String studentgender, String studentcontactNo,
			String studentemail, String studentpassword, String studentdob, String studentstatus, long cid,
			Course courseId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentgender = studentgender;
		this.studentcontactNo = studentcontactNo;
		this.studentemail = studentemail;
		this.studentpassword = studentpassword;
		this.studentdob = studentdob;
		this.studentstatus = studentstatus;
		this.cid = cid;
		this.courseId = courseId;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentgender() {
		return studentgender;
	}

	public void setStudentgender(String studentgender) {
		this.studentgender = studentgender;
	}

	public String getStudentcontactNo() {
		return studentcontactNo;
	}

	public void setStudentcontactNo(String studentcontactNo) {
		this.studentcontactNo = studentcontactNo;
	}

	public String getStudentemail() {
		return studentemail;
	}

	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}

	public String getStudentpassword() {
		return studentpassword;
	}

	public void setStudentpassword(String studentpassword) {
		this.studentpassword = studentpassword;
	}

	public String getStudentdob() {
		return studentdob;
	}

	public void setStudentdob(String studentdob) {
		this.studentdob = studentdob;
	}

	public String getStudentstatus() {
		return studentstatus;
	}

	public void setStudentstatus(String studentstatus) {
		this.studentstatus = studentstatus;
	}

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public Course getCourseId() {
		return courseId;
	}

	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentgender=" + studentgender
				+ ", studentcontactNo=" + studentcontactNo + ", studentemail=" + studentemail + ", studentpassword="
				+ studentpassword + ", studentdob=" + studentdob + ", studentstatus=" + studentstatus + ", cid=" + cid
				+ ", courseId=" + courseId + "]";
	}

    

   


  
}
