package org.example.service;

import org.example.entity.Course;
import org.example.interfaces.CourseInterface;
import org.example.interfaces.StudentInterface;
import org.example.interfaces.TeacherInterface;

import java.util.List;

public class CourseService implements CourseInterface {
    public static CourseInterface instance = null;
    public static  synchronized CourseInterface getInstance(){
        if (instance==null){
            instance = new CourseService();
        }
        return instance;
    }


    @Override
    public Course insert(Course s) {
        return null;
    }

    @Override
    public Course update(Course s) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean deleteByTeacherID(int id) {
        return false;
    }

    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public Course findById(int id) {
        return null;
    }
}
