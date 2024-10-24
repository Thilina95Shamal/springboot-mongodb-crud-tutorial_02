package com.example.proj.tutorial_03.model.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "employee")
public class Employee {

    @Transient
    public final static String SEQUENCE_EMPLOYEE = "sequence_employee";

    @Id
    private long id;

    private String name;

    private String[] projects;

    private List<String> companies;

    private Set<Long> contactNo;

    private Map<String,String> cardDetails;

}
