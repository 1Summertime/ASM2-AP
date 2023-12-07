package org.example.service;

import org.example.entity.Student;
import org.example.interfaces.StudentInterface;

import java.util.List;

public class BiologyStudent implements StudentInterface {

    public String toString() {
        return "Biology Student";
    }
    public BiologyStudent(){



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
