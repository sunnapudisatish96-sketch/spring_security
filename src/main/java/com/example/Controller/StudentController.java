package com.example.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Student;
import com.example.repo.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {
	private final StudentRepository studentRepository;
	public StudentController(StudentRepository studentRepository) {
		this.studentRepository=studentRepository;
	}
	@PostMapping("/save")
	public Student save(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	@GetMapping("/all")
	public List<Student>getAll(){
		return studentRepository.findAll();
	}
	
	

}
