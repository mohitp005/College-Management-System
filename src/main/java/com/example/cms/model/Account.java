package com.example.cms.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity(name = "account")
@Table(name = "account")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AA_ACCOUNT_SEQ")
    @SequenceGenerator(sequenceName = "AA_ACCOUNT_SEQ", allocationSize = 1, name = "AA_ACCOUNT_SEQ")
	private long account_id ;
	private long paid_fees;
	private long total_ammount ;
	private String fees_status;
	
	@Column(name="std_id")
	private long stdid;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="std_id",insertable = false,updatable = false)
	private Student studentId;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(long account_id, long paid_fees, long total_ammount, String fees_status, long stdid,
			Student studentId) {
		super();
		this.account_id = account_id;
		this.paid_fees = paid_fees;
		this.total_ammount = total_ammount;
		this.fees_status = fees_status;
		this.stdid = stdid;
		this.studentId = studentId;
	}

	public long getAccount_id() {
		return account_id;
	}

	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}

	public long getPaid_fees() {
		return paid_fees;
	}

	public void setPaid_fees(long paid_fees) {
		this.paid_fees = paid_fees;
	}

	public long getTotal_ammount() {
		return total_ammount;
	}

	public void setTotal_ammount(long total_ammount) {
		this.total_ammount = total_ammount;
	}

	public String getFees_status() {
		return fees_status;
	}

	public void setFees_status(String fees_status) {
		this.fees_status = fees_status;
	}

	public long getStdid() {
		return stdid;
	}

	public void setStdid(long stdid) {
		this.stdid = stdid;
	}

	public Student getStudentId() {
		return studentId;
	}

	public void setStudentId(Student studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Account [account_id=" + account_id + ", paid_fees=" + paid_fees + ", total_ammount=" + total_ammount
				+ ", fees_status=" + fees_status + ", stdid=" + stdid + ", studentId=" + studentId + "]";
	}
	

	
	
	
}
