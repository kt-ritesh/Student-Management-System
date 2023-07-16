package com.ritesh.Student.Management.System.controller;

import com.ritesh.Student.Management.System.model.Student;
import com.ritesh.Student.Management.System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("student")
    String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @DeleteMapping("student/{id}")
    String deleteStudentById(@PathVariable Long id){
        return studentService.deleteStudentById(id);
    }

    @GetMapping("students")
    Iterable<Student> getAllStudent(){

        return studentService.getAllStudent();
    }

    @GetMapping("student/{id}")
    Optional<Student> getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
}
