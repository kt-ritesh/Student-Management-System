package com.ritesh.Student.Management.System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    private String bookTitle;
    private String bookAuthor;
    private String bookDescription;
    private String bookPrice;

    @ManyToOne
    @JoinColumn(name = "student_Id")
    private Student student;
}
