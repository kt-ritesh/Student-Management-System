package com.ritesh.Student.Management.System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseTitle;
    private String courseDescription;
    private String courseDuration;

    @ManyToMany
    @JoinTable(name = "student_Course",
            joinColumns = @JoinColumn(name = "course_Id"),
            inverseJoinColumns = @JoinColumn(name = "student_Id"))
    private List<Student> students;
}
