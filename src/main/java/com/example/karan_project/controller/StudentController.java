package com.example.karan_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.karan_project.entity.Student;
import com.example.karan_project.service.StudentService;

@RestController
@RequestMapping(value = "v1")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping(value = "/add-student")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		return ResponseEntity.status(HttpStatus.CREATED).
				body(studentService.saveStudent(student));
	}
	

}
