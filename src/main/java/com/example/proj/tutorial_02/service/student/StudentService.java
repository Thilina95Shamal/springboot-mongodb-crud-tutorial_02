package com.example.proj.tutorial_02.service.student;

import com.example.proj.tutorial_02.model.student.Student;

import java.util.List;

public interface StudentService {

    void createStudent(Student student);

    Student getStudentById(Integer id);

    List<Student> getStudents();

    Student udpateStudent(Integer id, Student student);

    void deleteStudent(Integer id);

    List<Student> createStudentList(List<Student> studentList);
}
