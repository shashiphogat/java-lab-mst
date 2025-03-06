package com.example.services;

import java.util.List;

import com.example.database.StudentDb;
import com.example.modal.Student;

public class StudentService {
    
    private StudentDb studentDb;
    public Student createStudent(Student student)
    {
        return studentDb.save(student);
    }

    public List<Student> getAllStudents()
    {
        return studentDb.findAll();
    }

    public Student getStudentByID(String id)
    {
        return studentDb.findByID(id);
    }
    
    public void getdeleteById(String id)
    {
        studentDb.deleteById(id);
    }
    public void getdeleteAll()
    {
        studentDb.deleteAll();
    }
    public Student getByName(String name)
    {
        return studentDb.findByName(name);
    }

}
