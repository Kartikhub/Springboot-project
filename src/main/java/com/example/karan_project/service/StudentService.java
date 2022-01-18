package com.example.karan_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.karan_project.entity.Student;
import com.example.karan_project.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	public Student saveStudent(Student student) {
		Student updateStudent = studentRepo.save(student);
		return updateStudent;
	}

}
