package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
	

}
