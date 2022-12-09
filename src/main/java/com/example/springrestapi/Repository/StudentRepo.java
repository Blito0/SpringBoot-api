package com.example.springrestapi.Repository;


import com.example.springrestapi.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{

    Student findByEmailId(String emailId);
}

