package com.example.karan_project.dto;

import com.example.karan_project.enums.AssignmentCategory;

public class AssignmentDto {

	private AssignmentCategory assignmentCategory;
	private Long marks;
	private Long weightage;
	public AssignmentCategory getAssignmentCategory() {
		return assignmentCategory;
	}
	public void setAssignmentCategory(AssignmentCategory assignmentCategory) {
		this.assignmentCategory = assignmentCategory;
	}
	public Long getMarks() {
		return marks;
	}
	public void setMarks(Long marks) {
		this.marks = marks;
	}
	public Long getWeightage() {
		return weightage;
	}
	public void setWeightage(Long weightage) {
		this.weightage = weightage;
	}
	public AssignmentDto(AssignmentCategory assignmentCategory, Long marks, Long weightage) {
		super();
		this.assignmentCategory = assignmentCategory;
		this.marks = marks;
		this.weightage = weightage;
	}
	
}
