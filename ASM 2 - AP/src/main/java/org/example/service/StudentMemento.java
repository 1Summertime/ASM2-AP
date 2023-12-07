package org.example.service;

public class StudentMemento {
    private int parentID;
    private String studentCode;
    private String groupCode;
    private float gpa;

    public StudentMemento(String studentCode, String groupCode, float gpa) {

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
}
