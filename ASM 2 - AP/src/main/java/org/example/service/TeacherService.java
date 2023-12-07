package org.example.service;

import org.example.entity.Student;
import org.example.entity.Teacher;
import org.example.interfaces.TeacherInterface;

import java.util.List;

public class TeacherService implements TeacherInterface {
    public static TeacherInterface instance = null;
    public static  synchronized TeacherInterface getInstance(){
        if (instance==null){
            instance = new TeacherService();
        }
        return instance;
    }


    @Override
    public Teacher insert(Teacher s) {
        System.out.println("Insert teacher " + s.getName());
        return null;
    }

    @Override
    public Teacher update(Teacher s) {
        System.out.println("Update teacher");
        return null;
    }

    @Override
    public boolean delete(int id) {
        System.out.println("Delete teacher");
        return false;
    }

    @Override
    public List<Teacher> findAll() {
        System.out.println("Find all teacher");
        return null;
    }

    @Override
    public Teacher findById(int id) {
        System.out.println("Find by id teacher");
        return null;
    }
}
