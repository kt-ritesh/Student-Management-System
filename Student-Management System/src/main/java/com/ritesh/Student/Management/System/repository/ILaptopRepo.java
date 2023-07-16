package com.ritesh.Student.Management.System.repository;

import com.ritesh.Student.Management.System.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends JpaRepository<Laptop, Long> {
}
