package com.example.springrestapi.Service;

import com.example.springrestapi.Entity.Student;
import com.example.springrestapi.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Override
    public Student addStudent(Student student) {

        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public Student getStudentByEmailId(String emailId) {
        return studentRepo.findByEmailId(emailId);
    }

    @Override
    public String deleteStudent(Long studentId) {
        studentRepo.deleteById(studentId);
        return "Student deleted with StudentId: " + studentId;
    }

    @Override
    public Student updateStudent(Student student) {
       return studentRepo.save(student);

    }
}
