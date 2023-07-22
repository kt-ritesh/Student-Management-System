package com.ritesh.Student.Management.System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;
    private String studentAge;
    private String studentPhoneNumber;
    private String studentBranch;
    private String studentDepartment;

    @OneToOne
    @JoinColumn(name = "address_Id")
    private Address address;


}
