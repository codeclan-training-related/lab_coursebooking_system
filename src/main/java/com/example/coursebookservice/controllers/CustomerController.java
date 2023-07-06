package com.example.coursebookservice.controllers;


import com.example.coursebookservice.models.Course;
import com.example.coursebookservice.models.Customer;
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
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;


//    @GetMapping(value = "/customers")
//    public ResponseEntity<List<Customer>> getAllCustomers(){
//        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
//    }

//    public ResponseEntity<List<Course>> getCourseByRating(
//            @RequestParam(name = "byCourseRating", required = false) Integer rating) {
//        if (rating!=null) {
//            return new ResponseEntity<>(courseRepository.findCourseByRating(rating), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
//        }
//    }



    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> getCustomersByCourse(
            @RequestParam(name="byCourseId",required = false) Long courseId){
        if(courseId!=null){
            return new ResponseEntity<>(customerRepository.findCustomersByBookingsCourseId(courseId),HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(customerRepository.findAll(),HttpStatus.OK);
        }

    }













}
