package com.ritesh.Student.Management.System.repository;

import com.ritesh.Student.Management.System.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends JpaRepository<Course, Long> {
}
