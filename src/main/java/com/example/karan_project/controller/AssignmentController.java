package com.example.karan_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.karan_project.dto.AssignmentDto;
import com.example.karan_project.dto.StudentDto;
import com.example.karan_project.entity.Assignment;
import com.example.karan_project.entity.Student;
import com.example.karan_project.entity.Subject;
import com.example.karan_project.service.AssignmentService;

@RestController
@RequestMapping(value = "v1")
public class AssignmentController {

	@Autowired
	private AssignmentService assignmentService;
	
	@PostMapping(value = "/add-assignment")
	public ResponseEntity<Assignment> saveAssignment(@RequestBody Assignment assignment) {
		return ResponseEntity.status(HttpStatus.CREATED).
				body(assignmentService.saveAssignment(assignment));
	}
	
	@GetMapping(value = "/stud/{id}")
	public ResponseEntity<StudentDto> getStud(@PathVariable Long id){
		return ResponseEntity.status(HttpStatus.OK).
				body(assignmentService.getStudents(id));
	}
	
	@GetMapping(value = "/students/{studentId}")
	public ResponseEntity<List<AssignmentDto>> getAssignments(@PathVariable Long studentId){
		return ResponseEntity.status(HttpStatus.OK).
				body(assignmentService.getAssignmentsByStudentId(studentId));
	}
}
