package com.example.coursebookservice.controllers;

import com.example.coursebookservice.models.Course;
import com.example.coursebookservice.repositories.CourseRepository;
import com.example.coursebookservice.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    CustomerRepository customerRepository;

    //find all courses
    @GetMapping(value = "/courses/rating")
    public ResponseEntity<List<Course>> getCourseByRating(
            @RequestParam(name = "byCourseRating", required = false) Integer rating) {
        if (rating!=null) {
            return new ResponseEntity<>(courseRepository.findCourseByRating(rating), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
        }
    }

    @GetMapping(value = "/courses")
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    };






}
