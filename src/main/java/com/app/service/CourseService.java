package com.app.service;

import com.app.model.Course;

import java.util.List;

public interface CourseService {


    List<Course> getAllCourse();

    Course getCourseById(int id);

    void saveCourse(Course course);

    void deleteCourse(int id);


   }
