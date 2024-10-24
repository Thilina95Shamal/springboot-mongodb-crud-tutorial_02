package com.example.proj.model.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "student")
public class Student {

    // When we set the SEQUENCE_NAME which is a reference to the auto-incremented sequence
    // Also the unique identifier "student_sequence" wil count on this particular table same for other models Eg: todo_sequence
    @Transient // We use Transient just for identification that we do not use in out table
    public static final String SEQUENCE_NAME = "student_sequence";

    // Note: When we use MongoDB we cannot use @GeneratedValues Annotation as for like MySql
    @Id
    private long rno;

    private String studentName;

    private String address;
}
