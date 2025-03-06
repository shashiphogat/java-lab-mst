package com.example.database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modal.Course;

public interface CourseDb extends JpaRepository<Course,String>{

    void saveAll(List<Course> courses);
    Course findByID(String id);
    List<Course> findAll();

    void deleteById(String id);
    void delete(Course course);
    void deleteAll();
} 
