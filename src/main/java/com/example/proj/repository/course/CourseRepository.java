package com.example.proj.repository.course;

import com.example.proj.model.course.Course;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends MongoRepository<Course,Integer> {
    /** Note : When we use Min Max or any other Aggregations , we dont have method so we use @Aggregation
     * pipelines provided by MongoDB */
    // min $ max are the variable and when declaring it should be the same value for the properties
    @Aggregation(pipeline = {"{$group:  {_id: '',max: {$max: $coursePrice}}}"})
    Double max();

    @Aggregation(pipeline = {"{$group:  {_id: '',min: {$min: $coursePrice}}}"})
    Double min();

}
