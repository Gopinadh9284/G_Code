package net.javaguides.springboot.repository;

import org.springframework.beans.factory.annotation.Autowired;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.JsonNode;

import net.javaguides.springboot.model.Pole;

@Repository
public interface PoleRepository extends JpaRepository<Pole, Long>{
	
	@Autowired
	Pole save(JsonNode pole);
	// Optional<Pole> findByUsername(String username);

}