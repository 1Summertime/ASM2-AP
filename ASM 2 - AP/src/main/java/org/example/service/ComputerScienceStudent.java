package org.example.service;

import org.example.entity.Student;
import org.example.interfaces.StudentInterface;

import java.util.List;

public class ComputerScienceStudent implements StudentInterface {

    public String toString() {
        return "Computer Science Student";
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
