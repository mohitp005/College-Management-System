package com.example.cms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cms.DAO.StudentDao;
import com.example.cms.model.Student;

@Service
public class StudentServicesImpl implements StudentServices {
	
	@Autowired
	public StudentDao studentdao;

	@Override
	public Student addStudent(Student student) {
		
		return studentdao.save(student);
	}

	@Override
	public void removeStudent(long studentId) {
		studentdao.deleteById(studentId);
		
	}

	@Override
	public List<Student> viewStudent() {
		// TODO Auto-generated method stub
		return studentdao.findAll();
	}

	@Override
	public Student viewStudentById(long studentId) {
		
		Optional <Student> category=studentdao.findById(studentId);
		return category.get();
	}

	@Override
	public Student updateStudent(Student student) {
		
   Optional <Student> stud=studentdao.findById(student.getStudentId());
		
		Student st=stud.get();
		
		st.setStudentId(student.getStudentId());
		st.setStudentName(student.getStudentName());
		st.setStudentpassword(student.getStudentpassword());
		st.setStudentgender(student.getStudentgender());
		st.setStudentemail(student.getStudentemail());
		st.setStudentdob(student.getStudentdob());
		st.setStudentcontactNo(student.getStudentcontactNo());
		st.setStudentstatus(student.getStudentstatus());
		st.setCid(student.getCid());
		
		st=studentdao.save(st);
		return st;
	}


	
	
	

}
