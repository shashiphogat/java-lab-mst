package com.example.database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modal.Course;
import com.example.modal.CourseAssignment;

public interface CourseAssignmentDb extends JpaRepository<CourseAssignment,String> {

    void saveAll(List<CourseAssignment> courseAssignments);
    Course findByID(String id);
    List<CourseAssignment> findAll();

    void deleteById(String id);
    void delete(CourseAssignment courseAssignment);
    void deleteAll();
    
}
