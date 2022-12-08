package com.example.cms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.cms.DAO.SubjectDao;
import com.example.cms.model.Subject;

@Service
public class SubjectServicesImpl implements SubjectServices {

	@Autowired
	public SubjectDao subjectdao;
	
	@Override
	public Subject addSubject(Subject subject) {
		
		return subjectdao.save(subject);
	}

	@Override
	public void removeSubject(long subjectId) {
		
		subjectdao.deleteById(subjectId);
		
	}

	@Override
	public List<Subject> viewSubject() {
		// TODO Auto-generated method stub
		return subjectdao.findAll();
	}

	@Override
	public Subject viewSubjectById(long subjectId) {
		
		Optional <Subject> sb=subjectdao.findById(subjectId);
		return sb.get();
	}

	@Override
	public Subject updateSubject(Subject subject) {
		
		Optional <Subject> sbj=subjectdao.findById(subject.getSubjectId());
		
		Subject sub=sbj.get();
		
		sub.setSubjectId(subject.getSubjectId());
		sub.setSubjectname(subject.getSubjectname());
		sub.setTchrid(subject.getTchrid());
		sub.setCourseId(subject.getCourseId());
		
		sub=subjectdao.save(sub);
		
		
		return sub;
	}



}
