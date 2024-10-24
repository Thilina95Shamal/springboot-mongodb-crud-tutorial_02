package com.example.proj.tutorial_02.controller.course;

import com.example.proj.tutorial_02.model.course.Course;
import com.example.proj.tutorial_02.service.course.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/api/v1/course/create")
    public ResponseEntity<?> createCourse(@RequestBody Course course){
        Course createdCourse= courseService.createCourse(course);
        return new ResponseEntity<>(createdCourse, HttpStatus.CREATED);
    }

    @GetMapping("/api/v1/course/minMax")
    public ResponseEntity<?> getCourseMinMax(){
        Map<String,Double> maxMin = courseService.getCourseMinMax();
        return new ResponseEntity<>(maxMin, HttpStatus.OK);
    }
}
