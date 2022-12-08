package com.example.cms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cms.model.Teacher;

@Service
public interface TeacherServices {

	public Teacher addTeacher(Teacher teacher);

	public void removeTeacher(long teacherId);

	public List<Teacher> viewTeacher();

	public Teacher viewTeacherById(long teacherId);

	public Teacher updateTeacher(Teacher teacher);

}
