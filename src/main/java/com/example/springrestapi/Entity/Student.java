package com.example.springrestapi.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(
        name = "tbl_student",
        uniqueConstraints = @UniqueConstraint(
                columnNames = "email_id"
        )
)
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_seequence",
            sequenceName = "student_seequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "student_seequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long studentId;
    private String firstName;
    private String secondName;

    @Column(
            name = "email_id",
            nullable = false
    )
    private String emailId;

}
