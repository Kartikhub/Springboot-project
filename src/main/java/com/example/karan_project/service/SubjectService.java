package com.example.karan_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.karan_project.entity.Subject;
import com.example.karan_project.repo.SubjectRepo;

@Service
public class SubjectService {

	@Autowired
	private SubjectRepo subjectRepo;
	
	public Subject saveSubject(Subject subject) {
		Subject updateSubject = subjectRepo.save(subject);
		return updateSubject;
	}

}
