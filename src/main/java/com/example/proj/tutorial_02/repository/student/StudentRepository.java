package com.example.proj.tutorial_02.repository.student;

import com.example.proj.tutorial_02.model.student.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student,Integer> {
}
