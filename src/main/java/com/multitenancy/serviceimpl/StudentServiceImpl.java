package com.multitenancy.serviceimpl;

import com.multitenancy.entity.Student;
import com.multitenancy.repository.StudentRepository;
import com.multitenancy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student save(Student student) {
        return this.studentRepository.save(student);
    }

    @Override
    public List<Student> findAll() {
        return this.studentRepository.findAll();
    }

    @Override
    public Optional<Student> findStudent(Long id) {
        return this.studentRepository.findById(id);
    }
}
