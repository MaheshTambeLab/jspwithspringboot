package com.example.fabjsptest.service;

import com.example.fabjsptest.entity.Student;
import com.example.fabjsptest.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> listAll() {
        return repo.findAll();
    }

    public void save(Student student) {
        repo.save(student);
    }

    public Student get(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
