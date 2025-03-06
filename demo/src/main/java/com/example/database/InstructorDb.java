package com.example.database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modal.Instructor;


public interface InstructorDb extends JpaRepository<Instructor,String>{

    void saveAll(List<Instructor> instructors);
    Instructor findByID(String id);
    List<Instructor> findAll();

    void deleteById(String id);
    void delete(Instructor instructor);
    void deleteAll();
} 
