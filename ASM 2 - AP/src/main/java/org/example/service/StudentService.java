package org.example.service;

import org.example.entity.Student;
import org.example.interfaces.StudentInterface;
import org.example.interfaces.TeacherInterface;

import java.util.List;

public abstract class StudentService implements StudentInterface {
    public static StudentInterface instance = null;
    public static  synchronized StudentInterface getInstance(){
        if (instance==null){
            instance = new StudentService() {

            };
        }
        return instance;
    }

    @Override
    public Student insert(Student s) {
        return null;
    }

    @Override
    public Student update(Student s) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(int id) {
        return null;
    }
}
