package com.example.cms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cms.model.Subject;

@Service
public interface SubjectServices {

	public Subject addSubject(Subject subject);
	public void removeSubject(long subjectId);
	public List<Subject> viewSubject();
	public Subject viewSubjectById(long subjectId);
	public Subject updateSubject(Subject subject);
	 
}
