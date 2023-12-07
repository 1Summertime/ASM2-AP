package org.example.service;

import org.example.interfaces.ManagerStudentInterface;

import java.util.ArrayList;
import java.util.List;

public class ProxyStudentManager implements ManagerStudentInterface {
    private RealStudentManager realManager;
    private List<String> expelledStudents;
    public ProxyStudentManager() {
        this.realManager = new RealStudentManager();
        this.expelledStudents = new ArrayList<>();
    }
    @Override
    public void enrollStudent(String studentName) {
        realManager.enrollStudent(studentName);
    }

    @Override
    public void expelStudent(String studentName) {
        realManager.expelStudent(studentName);
        expelledStudents.add(studentName);
    }

    @Override
    public void listStudents() {
        System.out.println("Enrolled Students:");
        realManager.listStudents();
        System.out.println("Expelled Students:");
        for (String student : expelledStudents) {
            System.out.println(student);
        }
    }
}
