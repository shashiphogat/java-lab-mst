package com.example.database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.modal.Enrollment;


public interface EnrollmentDb extends JpaRepository<Enrollment,String>{

    void saveAll(List<Enrollment> enrollments);
    Enrollment findByID(String id);
    List<Enrollment> findAll();

    void deleteById(String id);
    void delete(Enrollment enrollment);
    void deleteAll();
} 
