package com.example.karan_project.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.karan_project.enums.TypeOfSubjects;

@Entity
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Enumerated(EnumType.STRING)
	private TypeOfSubjects typeOfSubjects;
	
	@OneToMany(mappedBy = "subject")
	private List<Assignment> assignments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TypeOfSubjects getTypeOfSubjects() {
		return typeOfSubjects;
	}

	public void setTypeOfSubjects(TypeOfSubjects typeOfSubjects) {
		this.typeOfSubjects = typeOfSubjects;
	}

	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}

	
	
}
