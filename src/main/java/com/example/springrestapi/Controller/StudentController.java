package com.example.springrestapi.Controller;

import com.example.springrestapi.Entity.Student;
import com.example.springrestapi.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);

    }
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }
    @GetMapping("/{emailId}")
    public Student getStudentByEmailId(@PathVariable String emailId){
        return  studentService.getStudentByEmailId(emailId);

    }
    @DeleteMapping("/{studentId}")
    public String deleteStudent(@PathVariable Long studentId){
        return studentService.deleteStudent(studentId);

    }
    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);

    }

}
