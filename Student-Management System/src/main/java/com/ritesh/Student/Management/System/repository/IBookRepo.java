package com.ritesh.Student.Management.System.repository;

import com.ritesh.Student.Management.System.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends JpaRepository<Book, Long> {
}
