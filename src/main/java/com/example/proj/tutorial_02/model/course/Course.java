package com.example.proj.tutorial_02.model.course;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "course")
public class Course {

    @Transient
    public static String COURSE_SEQUENCE = "course_sequence";

    @Id
    private long courseId;

    private String courseName;

    private String courseDesc;

    private double coursePrice;
}
