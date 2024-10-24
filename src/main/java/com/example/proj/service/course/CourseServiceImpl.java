package com.example.proj.service.course;

import com.example.proj.model.course.Course;
import com.example.proj.repository.course.CourseRepository;
import com.example.proj.service.sequenceGeneratorService.SequenceGeneratorService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CourseServiceImpl implements CourseService{

    private final CourseRepository courseRepository;

    private final SequenceGeneratorService sequenceGeneratorService;

    public CourseServiceImpl(CourseRepository courseRepository, SequenceGeneratorService sequenceGeneratorService) {
        this.courseRepository = courseRepository;
        this.sequenceGeneratorService = sequenceGeneratorService;
    }

    @Override
    public Course createCourse(Course course) {
        course.setCourseId(sequenceGeneratorService.generateSequence(Course.COURSE_SEQUENCE));
        return courseRepository.save(course);
    }

    @Override
    public Map<String, Double> getCourseMinMax() {
        // 'The field 'total' must be an accumulator object' on server javaclustor-shard-00-02.worak.mongodb.net:27017.
        // The Above issue might come when there's a difference between properties in the pipeline and the variable
        // (set total to min or max in the pipeline)
        Double min = courseRepository.min();
        Double max = courseRepository.max();
        HashMap<String,Double> minMax = new HashMap<>();
        minMax.put("Min value",min);
        minMax.put("Max value",max);
        return minMax;
    }
}
