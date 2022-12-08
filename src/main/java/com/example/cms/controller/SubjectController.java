package com.example.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cms.model.Subject;
import com.example.cms.service.SubjectServices;

@RestController
@CrossOrigin
@RequestMapping("/cms")
public class SubjectController {
	
	@Autowired
	SubjectServices subjectservices;
	
	@GetMapping("/subject")
	public List<Subject> getAllSubject()
	{
		return subjectservices.viewSubject();
	}
	
	@GetMapping("/subject/{subjectId}")
	public Subject getSubjectById(@PathVariable("subjectId") long subjectId)
	{
		return subjectservices.viewSubjectById(subjectId);
	}
	
	@PostMapping("/subject")
	public Subject addSubject( @RequestBody Subject subject)
	{
		return subjectservices.addSubject(subject);
	}
	
	@PutMapping("/subject/{subjectId}")
	public Subject updateSubject(@RequestBody Subject subject) {
		
		return subjectservices.updateSubject(subject);
	}
	
	@DeleteMapping("/subject/{subjectId}")
	public String deleteSubject(@PathVariable("subjectId") long subjectId)
	{
		subjectservices.removeSubject(subjectId);
				return "Subject deleted succesfully";
	}	

}
