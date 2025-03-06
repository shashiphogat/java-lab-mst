package com.example.database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modal.Student;

public interface StudentDb extends JpaRepository<Student,String>{

    void saveAll(List<Student> students);
    Student findByID(String id);
    List<Student> findAll();
    Student findByName(String name);

    void deleteById(String id);
    void delete(Student student);
    void deleteAll();
} 
