package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.model.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	
	public List<Student>getAllStudents();
	
}


