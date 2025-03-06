package com.example.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Enrollment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @ManyToOne @JoinColumn(name = "Student_id")
    private Student student;
    @ManyToOne @JoinColumn(name = "Course_id")
    private Course course;

    private String enrollmentdate;
}
