package com.example.springrestapi.Service;

import com.example.springrestapi.Entity.Student;

import java.util.List;

public interface   StudentService {
    Student addStudent(Student student);

    List<Student> getAllStudent();

    Student getStudentByEmailId(String emailId);

    String deleteStudent(Long studentId);

    Student updateStudent(Student student);
}
