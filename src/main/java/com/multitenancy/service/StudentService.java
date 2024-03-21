package com.multitenancy.service;

import com.multitenancy.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public Student save(Student student);

    public List<Student> findAll();

    public Optional<Student> findStudent(Long id);

}
