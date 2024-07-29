package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Integer id);
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Integer id);
}
