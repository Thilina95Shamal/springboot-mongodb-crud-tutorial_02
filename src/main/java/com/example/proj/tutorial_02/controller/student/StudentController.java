package com.example.proj.tutorial_02.controller.student;

import com.example.proj.tutorial_02.model.student.Student;
import com.example.proj.tutorial_02.service.student.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/api/v1/student/create")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        studentService.createStudent(student);
        return new ResponseEntity<>("Student Created", HttpStatus.OK);
    }

    @GetMapping("/api/v1/student/get/{id}")
    public ResponseEntity<?> getStudent(@PathVariable Integer id){
        Student studentById = studentService.getStudentById(id);
        return new ResponseEntity<>(studentById, HttpStatus.OK);
    }

    @GetMapping("/api/v1/student/get")
    public ResponseEntity<?> getStudent(){
        List<Student> studentList = studentService.getStudents();
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    @PutMapping("/api/v1/student/update/{id}")
    public ResponseEntity<?> updateStudentById(@PathVariable Integer id,@RequestBody Student student){
        Student updatedStudent = studentService.udpateStudent(id,student);
        return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
    }

    @DeleteMapping("/api/v1/student/delete/{id}")
    public ResponseEntity<?> deleteStudentById(@PathVariable Integer id){
        studentService.deleteStudent(id);
        return new ResponseEntity<>("Student Deleted Successfully", HttpStatus.OK);
    }

    /** New Content Starts from Here since CRUD operation was already developed in previous Applications*/

    @PostMapping("/api/v1/students/create")
    public ResponseEntity<?> addStudentList(@RequestBody List<Student> studentList){
        List<Student> craeatedStudentList = studentService.createStudentList(studentList);
        return new ResponseEntity<>(craeatedStudentList, HttpStatus.CREATED);
    }

}
