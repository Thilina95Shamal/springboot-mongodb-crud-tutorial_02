package com.example.proj.tutorial_03.repository.employee;

import com.example.proj.tutorial_03.model.employee.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Integer> {
}
