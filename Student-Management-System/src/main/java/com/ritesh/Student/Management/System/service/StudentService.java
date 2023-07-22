package com.ritesh.Student.Management.System.service;

import com.ritesh.Student.Management.System.model.Student;
import com.ritesh.Student.Management.System.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;

    public String addStudent(Student student) {

        studentRepo.save(student);
        return "New student added";
    }

    public String deleteStudentById(Long id) {
        studentRepo.deleteById(id);

        return "A student deleted";
    }

    public Iterable<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepo.findById(id);
    }

}
