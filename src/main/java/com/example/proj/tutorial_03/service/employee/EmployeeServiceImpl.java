package com.example.proj.tutorial_03.service.employee;

import com.example.proj.tutorial_02.service.sequenceGeneratorService.SequenceGeneratorService;
import com.example.proj.tutorial_03.model.employee.Employee;
import com.example.proj.tutorial_03.repository.employee.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    private final SequenceGeneratorService sequenceGeneratorService;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, SequenceGeneratorService sequenceGeneratorService) {
        this.employeeRepository = employeeRepository;
        this.sequenceGeneratorService = sequenceGeneratorService;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        employee.setId(sequenceGeneratorService.generateSequence(Employee.SEQUENCE_EMPLOYEE));
        return employeeRepository.save(employee);
    }
}
