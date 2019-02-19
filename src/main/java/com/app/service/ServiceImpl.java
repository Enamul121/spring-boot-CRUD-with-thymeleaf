package com.app.service;

import com.app.model.Course;
import com.app.repo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServiceImpl implements CourseService {

    @Autowired
    CourseRepository repository;

    @Override
    public List<Course> getAllCourse() {
        return (List<Course>) repository.findAll();
    }


    @Override
    public Course getCourseById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void saveCourse(Course course) {

        repository.save(course);
    }

    @Override
    public void deleteCourse(int id) {

        repository.deleteById(id);
    }



}
