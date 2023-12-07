package org.example.entity;

import org.example.core.Person;
import org.example.interfaces.NotifyInterface;
import org.example.interfaces.StudentFactory;
import org.example.service.BiologyStudent;
import org.example.service.StudentMemento;

import java.util.Date;

public class Student extends Person implements NotifyInterface {
    private int parentID;
    private String studentCode;
    private String groupCode;
    private float gpa;

    public Student(){

    }

    // Example of using the Student Builder

    public Student (int id,String name){
        setId(id);
        setName(name);
    }
    public Student (String studentCode,String groupCode,float gpa){
        setStudentCode(studentCode);
        setGroupCode(groupCode);
        setGpa(gpa);
    }
    public Student(int id, String name, String address, String phone, String personID, Date birthDate, String email,
                   int parentID, String studentCode, String groupCode, float gpa) {
        super(id, name, address, phone, personID, birthDate, email);
        this.parentID = parentID;
        this.studentCode = studentCode;
        this.groupCode = groupCode;
        this.gpa = gpa;
    }


    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public void notification() {

    }

    public void submitAssignment(String assignment) {
        System.out.println(studentCode + " has submitted the assignment: " + assignment);
    }
    public void displayInfo() {
        System.out.println("StudentID: " + studentCode + ", Class: " + groupCode+"Grade: "+gpa);
    }

    // Create a memento
    public StudentMemento createMemento() {
        return new StudentMemento(studentCode, groupCode,gpa);

    }

    // Restore state from a memento
    public void restoreFromMemento(StudentMemento memento) {
        this.studentCode = memento.getStudentCode();
        this.groupCode = memento.getGroupCode();
        this.gpa = memento.getGpa();
    }

    // Update student information
    public void updateInfo(String studentCode,String groupCode, float gpa) {
        this.studentCode = studentCode;
        this.groupCode = groupCode;
        this.gpa = gpa;
    }
    public static void createStudent(StudentFactory factory) {
        BiologyStudent student = factory.createStudent();
        System.out.println("Created: " + student);
    }
}
