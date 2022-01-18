package com.example.karan_project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.karan_project.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
