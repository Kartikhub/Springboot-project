package com.example.karan_project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.karan_project.entity.Assignment;
import com.example.karan_project.entity.Student;

public interface AssignmentRepo extends JpaRepository<Assignment, Long>{
	
	@Query(value = "Select * from assignment where student_id = ?1", nativeQuery = true)
	List<Assignment> getAssignmentsByStudentId(Long studentid);
}
