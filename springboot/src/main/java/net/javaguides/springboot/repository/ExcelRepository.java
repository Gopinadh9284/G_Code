package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.javaguides.springboot.model.Pole;

@Repository
public interface ExcelRepository extends JpaRepository<Pole, Long> {
    // Add custom query methods if needed
}



