package net.javaguides.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Pole;
import net.javaguides.springboot.repository.PoleRepository;

@Service
public class ExcelService {
    @Autowired
    private PoleRepository repository;

    public List<Pole> getAllData() {
        return repository.findAll();
    }
}
