package com.example.cms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cms.DAO.TeacherDao;
import com.example.cms.model.Teacher;

@Service
public class TeacherServicesImpl implements TeacherServices {

	@Autowired
	TeacherDao teacherdao;

	@Override
	public Teacher addTeacher(Teacher teacher) {
		return teacherdao.save(teacher);
	}

	@Override
	public void removeTeacher(long teacherId) {
		teacherdao.deleteById(teacherId);
	}

	@Override
	public List<Teacher> viewTeacher() {
		return teacherdao.findAll();
	}

	@Override
	public Teacher viewTeacherById(long teacherId) {
		Optional<Teacher> category = teacherdao.findById(teacherId);
		return category.get();
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		Optional<Teacher> teachers = teacherdao.findById(teacher.getTeacherId());

		Teacher at = teachers.get();

		at.setTeacherId(teacher.getTeacherId());
		at.setTeacherName(teacher.getTeacherName());
		at.setTeachergender(teacher.getTeachergender());
		at.setTeachercontactNo(teacher.getTeachercontactNo());
		at.setTeacheremail(teacher.getTeacheremail());
		at.setTeacherpassword(teacher.getTeacherpassword());
		at.setTeacherdob(teacher.getTeacherdob());
		at.setTeacherstatus(teacher.getTeacherstatus());
		
		at = teacherdao.save(at);
		return at;
	}

}
