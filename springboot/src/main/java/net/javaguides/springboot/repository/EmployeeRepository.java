package net.javaguides.springboot.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.JsonNode;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.Pole;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	@Autowired
	Pole save(JsonNode pole);
}