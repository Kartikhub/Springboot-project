package com.example.karan_project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.karan_project.dto.AssignmentDto;
import com.example.karan_project.dto.StudentDto;
import com.example.karan_project.entity.Assignment;
import com.example.karan_project.entity.Student;
import com.example.karan_project.repo.AssignmentRepo;

@Service
public class AssignmentService {
	
	@Autowired
	private AssignmentRepo assignmentRepo;
	
	public Assignment saveAssignment(Assignment assignment) {
		Assignment updateAssignment = assignmentRepo.save(assignment);
		return updateAssignment;
	}
	
	public StudentDto getStudents(Long id) {
		Assignment assignment= assignmentRepo.findById(id).get();
		Student student= assignment.getStudent();
		StudentDto studentDto= new StudentDto(student.getId(), student.getName());
		return studentDto;
	}
	
	public List<AssignmentDto> getAssignmentsByStudentId(Long studentId){
		List<Assignment> assignments= assignmentRepo.getAssignmentsByStudentId(studentId);
		List<AssignmentDto> assignmentDtos = new ArrayList<AssignmentDto>();
		for(Assignment assignment:assignments) {
			assignmentDtos.add(new AssignmentDto(assignment.getAssignmentCategory(), assignment.getMarks(), assignment.getWeightage()));
		}
		
		return assignmentDtos;
	}
}
