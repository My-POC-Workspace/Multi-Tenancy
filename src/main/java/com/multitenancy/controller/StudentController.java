package com.multitenancy.controller;

import com.multitenancy.entity.Student;
import com.multitenancy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/")
    public Student saveStudent(Student student){
        return this.studentService.save(student);
    }

    @GetMapping(value = "/")
    public List<Student> getAllStudent(){
        return this.studentService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Student> getStudent(@PathVariable Long id){
        return this.studentService.findStudent(id);
    }

}
