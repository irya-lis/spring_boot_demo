package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudent();

    void addNewStudent(Student student);

    void deleteStudent(Long studentId);

    void updateStudent(Long studentId, String name, String email);
}
