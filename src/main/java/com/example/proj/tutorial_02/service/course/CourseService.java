package com.example.proj.tutorial_02.service.course;

import com.example.proj.tutorial_02.model.course.Course;

import java.util.Map;

public interface CourseService {

    Course createCourse(Course course);

    Map<String, Double> getCourseMinMax();
}
