package com.example.proj.service.course;

import com.example.proj.model.course.Course;

import java.util.Map;

public interface CourseService {

    Course createCourse(Course course);

    Map<String, Double> getCourseMinMax();
}
