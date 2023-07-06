package com.example.coursebookservice.repositories;

import com.example.coursebookservice.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Long> {
    List<Course> findCourseByRating(Integer rating);



}
