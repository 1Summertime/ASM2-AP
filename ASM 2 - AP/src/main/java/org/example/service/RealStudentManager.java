package org.example.service;

import org.example.interfaces.ManagerStudentInterface;

import java.util.ArrayList;
import java.util.List;

public class RealStudentManager implements ManagerStudentInterface {
    private List<String> enrolledStudents;
    public RealStudentManager() {
        this.enrolledStudents = new ArrayList<>();
    }
    @Override
    public void enrollStudent(String studentName) {
        System.out.println("Enrolling student: " + studentName);
        enrolledStudents.add(studentName);
    }

    @Override
    public void expelStudent(String studentName) {
        System.out.println("Expelling student: " + studentName);
        enrolledStudents.remove(studentName);
    }

    @Override
    public void listStudents() {
        System.out.println("Enrolled Students:");
        for (String student : enrolledStudents) {
            System.out.println(student);
        }
    }
}
