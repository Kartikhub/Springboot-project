package com.example.karan_project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.karan_project.entity.Subject;

public interface SubjectRepo extends JpaRepository<Subject, Long>{
	
}
