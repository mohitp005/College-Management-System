package com.example.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name="admin")
@Table(name="admin")
public class Admin {
	
	@Id
	
	@Column(name = "role_id", length = 255)
	 private Long roleId;
	@Column(name = "admin_name", length = 255)
    private String adminname;
    @Column(name = "admin_gender", length = 255)
    private String admingender;
    @Column(name = "admin_contactNo", length = 255)
    private String admincontactNo;
    @Column(name = "admin_email", length = 255)
    private String adminemail;
    @Column(name = "admin_password", length = 255)
    private String adminpassword;
    @Column(name = "admin_dob", length = 255)
    private String admindob;
    
    
    public Admin()
    {
    	super();
    }


	public Admin(Long roleId, String adminname, String admingender, String admincontactNo, String adminemail,
			String adminpassword, String admindob) {
		super();
		this.roleId = roleId;
		this.adminname = adminname;
		this.admingender = admingender;
		this.admincontactNo = admincontactNo;
		this.adminemail = adminemail;
		this.adminpassword = adminpassword;
		this.admindob = admindob;
	}


	public Long getRoleId() {
		return roleId;
	}


	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}


	public String getAdminname() {
		return adminname;
	}


	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}


	public String getAdmingender() {
		return admingender;
	}


	public void setAdmingender(String admingender) {
		this.admingender = admingender;
	}


	public String getAdmincontactNo() {
		return admincontactNo;
	}


	public void setAdmincontactNo(String admincontactNo) {
		this.admincontactNo = admincontactNo;
	}


	public String getAdminemail() {
		return adminemail;
	}


	public void setAdminemail(String adminemail) {
		this.adminemail = adminemail;
	}


	public String getAdminpassword() {
		return adminpassword;
	}


	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}


	public String getAdmindob() {
		return admindob;
	}


	public void setAdmindob(String admindob) {
		this.admindob = admindob;
	}


	@Override
	public String toString() {
		return "Admin [roleId=" + roleId + ", adminname=" + adminname + ", admingender=" + admingender
				+ ", admincontactNo=" + admincontactNo + ", adminemail=" + adminemail + ", adminpassword="
				+ adminpassword + ", admindob=" + admindob + "]";
	}
   
	


	

}
