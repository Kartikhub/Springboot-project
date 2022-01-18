 package com.example.karan_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.karan_project.entity.Subject;
import com.example.karan_project.service.SubjectService;

@RestController
@RequestMapping(value = "v1")
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@PostMapping(value = "/add-subject")
	public ResponseEntity<Subject> saveStudent(@RequestBody Subject subject) {
		return ResponseEntity.status(HttpStatus.CREATED).
				body(subjectService.saveSubject(subject));
	}
	
	
}
