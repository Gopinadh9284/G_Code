package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Student;
import net.javaguides.springboot.service.StudentService;

@RestController
@RequestMapping("/Student")
@CrossOrigin("*")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/api")
	public String add (@RequestBody Student student) {
		studentService.saveStudent(student);
		return "New  Student is added";
	}
	
	@GetMapping("/getdata")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
}
